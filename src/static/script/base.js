//这是一个基础库，提供基础方法。

var domExtraFuncList = ["hasClass", "addClass", "removeClass"]

var baselib = {
	StrictMode: false, //严格模式，将影响链式调用。如果开启，函数执行出错时将返回空，关闭时只会返回元素本身。
	el: function(tagName){
		var element = document.createElement(tagName)
		if(HTMLUnknownElement && element instanceof HTMLUnknownElement)
			return null
		for(var i = 0 ; i < domExtraFuncList.length ; i++){
			var func = domExtraFuncList[i]
			if(this[func])
				element[func] = this[func]
		}
		return element
	},
	
	id: function(id){
		return document.getElementById(id)
	},
	
	hasClass: function(el, className){
		if(!el.className)
			return false
		return new RegExp("(?:^|\\s+)" + className + "(?:\\s+|$)").test(el.className)
	},
	
	addClass: function(el, className){
		if(!el.className){
			if(this.StrickMode){
				return null
			}else{
				return el
			}
		}
		if (!this.hasClass(el, className)) {
	        el.className = el.className ? [el.className, className].join(' ') : className
	    }
		return el
	},
	
	removeClass: function(el, className){
		if(!el.className){
			if(this.StrickMode){
				return null
			}else{
				return el
			}
		}
		if (this.hasClass(className)) {
	        var c = el.className
	        this.className = c.replace(new RegExp("(?:^|\\s+)" + className + "(?:\\s+|$)", "g"), "")
	    }
		return true
	}
}

window.$ = baselib