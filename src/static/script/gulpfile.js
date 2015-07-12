var gulp = require("gulp");
var less = require("gulp-less");
var path = require("path")

gulp.task("less" , function(){
	console.log(less);
	
	return gulp.src("*.less").pipe(less({
      paths: [ path.join(__dirname, 'less', 'includes') ]
    })).pipe(gulp.dest("./"));
});

gulp.task("watch" , function(){
	gulp.watch("*.less" , function(){
		gulp.src("*.less").pipe(less({
	      paths: [ path.join(__dirname, 'less', 'includes') ]
	    })).pipe(gulp.dest("./"));
	})
});