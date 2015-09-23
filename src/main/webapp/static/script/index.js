void function(){
	window.onload = function(){
		var $registerBtn = $("#registerBtn");
		var $loginBtn = $("#loginBtn");
		var dialogTemplate = ['<div class="dialogContainer">',
				'<div class="dialogTitle">',
					'<img src="#">',
					'<span class = "closeBtn">x</span>',
				'</div>',
				'<div class="dialogBody">',
				'<div class="registerSection">',
						'<div class="title">',
							'创建新账号',
						'</div>',
						'<form class="registerForm">',
							'<input type = "text" placeholder = "用户名"><br/>',
							'<input type = "text" placeholder = "邮箱"><br/>',
							'<input type = "text" placeholder = "密码"><br/>',
							'<input type = "text" placeholder = "再次确认密码"><br/>',
							'<div class="registerFooter">',
								'<span>同意并接受<a href="#">(服务条款)</a></span>',
								'<button class = "submit">注册</button>',
							'</div>',
						'</form>',
					'</div>',
					'<div class="loginSection">',
						'<div class="title">',
							'用户登录',
						'</div>',
						'<form class="loginForm">',
							'<input type = "text" placeholder = "邮箱"><br/>',
							'<input type = "text" placeholder = "密码"><br/>',
							'<div class="loginFooter">',
								'<a href="#">找回密码</a>',
								'<button class = "submit">登录</button>',
							'</div>',
						'</form>',
					'</div>',
				'</div>',
			'</div>'].join("")

		var dialog = DialogFactory.createDialog({
			content: dialogTemplate
		})
		
		$registerBtn.click(function(){
			dialog.append($(document.body))
		})
		$registerBtn.click()
		
		$loginBtn.click(function(){
			dialog.append($(document.body))
		})

		var $closeBtn = $(".closeBtn")
		$closeBtn.click(function(){
			dialog.hide()
		})
	}
	
}(window, window)