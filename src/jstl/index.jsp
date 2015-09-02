<!doctype>
<html>
	<meta charset="UTF-8">
	<title>问答网站</title>
	<head>
		<link rel="stylesheet" href="../static/css/question.css">
	</head>
	<body>
		<div class = "navbar">
			<a href="#" class = "navbar-item logo">logo</a>
			<div class="navbar-item">
				<form action="#" method="post">
					<input type="text" name="content" id="SearchContent">
					<input type="submit" value="提交">
				</form>
			</div>
			<div class = "navbar-item right">
				<a href="#" class = "navbar-link">username</a>
				<label class = "navbar-item pos-rel">
					<a href="#" class="navbar-link">detail</a>
					<ul class = "navbar-dropdown dis-none">
						<li class = "navbar-dropdown-item">
							<a href="#" class = "navbar-link">username</a>
						</li>
						<li class = "navbar-dropdown-item">
							<a href="#" class = "navbar-link">userpassword</a>
						</li>
						<li class = "navbar-dropdown-item">
							<a href="#" class = "navbar-link">usernickname</a>
						</li>
					</ul>	
				</label>
				<a href="#" class="navbar-link">info</a>
				<a href="#" class="navbar-link">logout</a>
			</div>
			<div class="clear-both"></div>
		</div>
		<div class="main-wrapper">	
			<div class = "subnavbar">
				<div class="navbar-item left">
					Logo
				</div>
				<div class="navbar-item right">
					<a href="#" class = "navba-link-reverse">问题</a>
					<a href="#" class = "navba-link-reverse">文档</a>
					<a href="#" class = "navba-link-reverse">标签</a>
					<a href="#" class = "navba-link-reverse">用户</a>
					<a href="#" class = "navba-link-reverse">勋章</a>
				</div>
				<div class="clear-both"></div>
			</div>
			<div class="content-wrapper">
				<h2>{%=  %}</h2>
				<h2>工程管理，工程咨询，项目管理有什么区别？各有什么特长？</h2>
				<div class = "content-title-divider"></div>
				<div class="main-content">
					<div class="question-section">
						<ul class = "left">
							<li>
								<a href="#">
									<span class = "up-arrow"></span>
								</a>
							</li>
							<li>
								<h3 style = "text-align : center;">5</h3>
							</li>
							<li>
								<a href="#">
									<span class="down-arrow"></span>
								</a>
							</li>
						</ul>
						<div class = "question-content">
							<p>
								最近在和公司同事聊天的过程中。
							</p>
						</div>
						<div class = "clear-both"></div>
					</div>
					<div class="content-title-divider"></div>
					<div class="navbar answer-navbar">
						<span class = "navbar-item left">1个回答</span>
						<div class="navbar-item right">
							<a href="#" class = "navbar-link-reverse">默认排序</a>
							<a href="#" class="navbar-link-reverse">时间排序</a>
						</div>
					</div>
					<div class="content-title-divider"></div>
				</div>
				<div class="side">
					<ul>
						<li>
							<div class="side-section">
								<h4>社区日志</h4>
								<p>社区日志啦啦啦啦啦啦啦啦啦啦啦啦啦</p>
							</div>
						</li>
						<li>
							<div class="side-section">
								<h4>热门问题:</h4>
								<ul>
									<li>1. ...</li>
									<li>2. ...</li>
									<li>3. ...</li>
									<li>4. ...</li>
									<li>5. ...</li>
								</ul>
							</div>
						</li>
						<li>
							<div class="side-section">
								<h4>今日top10:</h4>
								<ul>
									<li>1. 鲁班</li>
									<li>2. 路人甲</li>
									<li>3. Jay</li>
								</ul>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</body>
	<script src = "../static/script/index.js"></script>
	<script>
		
	</script>
</html>