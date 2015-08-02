<%@ page pageEncoding="UTF-8" %>
<script type="text/javascript">
 var menu = {
   logout: function() {
     $.post(
       '${base}/user/signout',
       function(data) {
    	 if (data.retVal = "200") {
           window.location.href="${base}/user/signin"; 
    	 }
       });
   }
 }
</script>
<style type="text/css">
 body{
   padding-top:50px;
 }    

 table.floatThead-table {
   border-top: none;
   border-bottom: none;
   background-color: #fff;
 }

 .logo {
   padding: 4px 15px;
   vertical-align:middle;
 }
</style>

<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand logo" href="#">
        <img alt="logo" src="${base}/image/logo.png" />
      </a>
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${base}/home">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Rule <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${base}/rule/content">Content</a></li>
            <li><a href="${base}/rule/version">Version</a></li>
            <li class="divider"></li>
            <li><a href="${base}/rule/template">Template</a></li>
          </ul>
        </li>
        <li><a href="${base}/monitor/info">Monitor</a></li>
        <shiro:hasRole name="admin"> 
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Management <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="${base}/management/user">User Management</a></li>
              <%--               <li><a href="${base}/management/group">Group Management</a></li> --%>
              <li class="divider"></li>
              <li><a href="${base}/management/action">Action</a></li>
            </ul>
          </li>
        </shiro:hasRole>
      </ul>
      <p class="navbar-text navbar-right" style="margin-right: 10px;">Hello,<span style="color:red"><shiro:principal/></span>&nbsp;&nbsp;&nbsp;<a href="${base}/user/signin" class="navbar-link navbar-right" onclick="menu.logout();return false;">Sign out</a></p>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
