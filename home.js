function search() {
	var input = document.getElementById("search").value;
	const coursesAPI = "https://api.umd.io/v0/courses?";
	const linkBase = "http://jhacks2020.glitch.me/classes/";
	const classRegExp = /([A-Z]{4})([0-9]{3})/;
	const ul = document.getElementById("class_list");
	var str = "";

	fetch(coursesAPI + "dept_id=" + input).then((response)=> {
		return response.json();
	}).then((myJson) => { for (i = 0; i < myJson.length; i++) {

					match = myJson[i].course_id.match(classRegExp);
					link = linkBase + match[1] + "/" + match[2];

					str += "<li><a class=\"btn btn-primary\" href=link role=\"button\">"
									+ myJson[i].course_id + "</a></li>";


									
				}
				ul.innerHTML = str;
	});
}
