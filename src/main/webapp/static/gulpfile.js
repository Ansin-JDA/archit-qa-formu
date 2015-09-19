var gulp = require("gulp");
var path = require("path")

gulp.task("watch" , function(){
	gulp.watch("script/*.js" , function(){
		gulp.src("script/*.js").pipe(gulp.dest("D://JDA_work//JDA_Software//apache-tomcat-7.0.55//webapps//" +
				"knowledge_forum//static//script//"));
	})
});