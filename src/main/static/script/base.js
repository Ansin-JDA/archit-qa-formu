//这是一个基础库，提供基础方法。

var baseLib = function(){
	//公有属性和方法.
	var StrictMode = false
	
	var el = function(tagName){
		try{
			var element = document.createElement(tagName)
		}catch(e){
			return _element(tagName)
		}
		if((HTMLUnknownElement && element instanceof HTMLUnknownElement) || !element)
			return null
		return wrap(element)
	}
	
	var id = function(id){
		return wrap(document.getElementById(id))
	}
	
	var wrap = function(element){
		if(element === undefined || element === null)
			return element
		if(_isWrapped(element))
			return element
		return _wrap(element)
	}
	
	var domReady = function(callback){
		addEvent.call(window, "load", callback, false)
	}
	
	var domAllReady = function(callback){
		addEvent.call(window, "load", callback, false)
	}
	
	var extend = function(target, src, cover){
		if(cover === undefined && typeof(src) === "bool"){
			cover = src
			src = target
			target = {}
		}
		for(var prop in src){
			if(src.hasOwnProperty(prop)){
				if(target[prop] !== undefined && !cover){
					continue
				}else{
					target[prop] = src[prop]
				}
			}
		}
		return target
	}
	
	//将赋给元素的函数写在下面数组里，这个数组里的函数内的this，指的都是element。
	var hasClass = function(className){
		if(!this.className)
			return false
		return new RegExp("(?:^|\\s+)" + className + "(?:\\s+|$)").test(this.className)
	}
	
	var addClass = function(className){
		if(!this.className){
			if(StrickMode){
				return null
			}else{
				return this
			}
		}
		if (!this.hasClass(className)) {
	        this.className = this.className ? [this.className, className].join(' ') : className
	    }
		return this
	}
	
	var removeClass = function(className){
		if(!this.className){
			if(StrickMode){
				return null
			}else{
				return this
			}
		}
		if (this.hasClass(className)) {
	        var c = this.className
	        this.className = c.replace(new RegExp("(?:^|\\s+)" + className + "(?:\\s+|$)", "g"), "")
	    }
		return this
	}
	
	var addEvent = function(eventName, callback, bubble){
		if(this.addEventListener){
			this.addEventListener(eventName, callback, bubble)
		}else if(this.attachEvent){
			this.attachEvent("on"+ eventName, callback)
		}
	}
	
	var child = function(index){
		if(index < 0)
			return undefined
		if(this.children){
			return this.children[index] //如果有children属性，直接使用。ie9以下没有。
		}else{
			//兼容ie9以下
			var _index = 0
			for(var i = 0 ; i < this.childNodes.length ; i++){
				var childNode = this.childNodes[i]
				if(childNode.nodeType === Node.ELEMENT_NODE){
					if(_index === index){
						return wrap(childNode)
					}
					_index++
				}
			}
		}
	}
	
	var domExtraFuncList = {
		"hasClass": hasClass,
		"addClass": addClass,
		"removeClass": removeClass,
		"addEvent": addEvent,
		"child": child,
		"wrapped": true
	}
	
	//私有方法
	var _wrap = function(el){
		for(var name in domExtraFuncList){
			if(domExtraFuncList.hasOwnProperty(name)){
				el[name] = domExtraFuncList[name]
			}
		}
		return el
	}
	
	var _isWrapped = function(el){
		if(el.wrapped)
			return true
		return false
	}
	
	var _element = function(elementInnerHTML){
		var temp = el("div")
		temp.innerHTML += elementInnerHTML
		return temp.child(0)
	}
	
	//export
	return {
		"StrictMode": StrictMode,
		"el": el,
		"id": id,
		"wrap": wrap,
		"domReady": domReady,
		"domAllReady": domAllReady,
		"extend": extend,
	}
}

window.$ = baseLib()