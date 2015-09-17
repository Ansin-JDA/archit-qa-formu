void function(require, exports){
	var $closeGuideNavBar = $("#closeGuideNavBar")

	//先判断是否显示引导框
	var cookieName = "GuideNavBarCloseTime"
	var closeTime = parseInt(Cookies.get(cookieName))
	if(closeTime !== closeTime){ //cookie不存在
		closeTime.set(cookieName, 0, {
			expires: 365,
		})
	}else{ //cookie以存在
		closeTime.set(cookieName, closeTime, {
			expires: 365,
		})
	}

	if(closeTime >= 2){
		$closeGuideNavBar.css("display", "none")
	}else{
		$closeGuideNavBar.click(function(e){
			closeTime.set(cookieName, closeTime++, {
				expires: 365,
			})
			$closeGuideNavBar.css("display", "none")
		})
	}

	var dialogTamplate = '<div class="dialogContainer">\
		<div class="dialogTitle">\
			<img src="#">\
			<span>x</span>\
		</div>\
		<div class="dialogBody">\
			<div class="registerSection">\
				<div class="title">\
					创建新账号\
				</div>\
				<form class="registerForm">\
					<input type = "text" placeholder = "用户名">\
					<input type = "text" placeholder = "邮箱">\
					<input type = "text" placeholder = "密码">\
					<input type = "text" placeholder = "再次确认密码">\
					<div class="registerFooter">\
						<span>同意并接受<a href="#">(服务条款)</a></span>\
						<button class = "submit">注册</button>\
					</div>\
				</form>\
			</div>\
			<div class="loginSection">\
				<div class="title">\
					用户登录\
				</div>\
				<form class="loginForm">\
					<input type = "text" placeholder = "邮箱">\
					<input type = "text" placeholder = "密码">\
					<div class="loginFooter">\
						<a href="#">找回密码</a>\
						<button class = "submit">登录</button>\
					</div>\
				</form>\
			</div>\
		</div>\
	</div>'

	var $registerBtn = $("#registerBtn")
	,	$loginBtn = $("#loginBtn")
	,	dialog = DialogFactory.createDialog({
		content: dialogTamplate
	})

	$registerBtn.click(function(){
		dialog.append(document.body)
	})


}(window, window)













