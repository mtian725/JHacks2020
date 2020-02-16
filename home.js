function search() {
	var input = document.getElementById("search").value;
	var number = document.getElementById("number").value;
	const coursesAPI = "https://api.umd.io/v0/courses?";
	const linkBase = "http://jhacks2020.glitch.me/classes/";
	const classRegExp = /^([A-Z]{4})([0-9]{3}[A-Z]?)$/;
	const ul = document.getElementById("class_list");
	str = "";

	if (number==="") {
		fetch(coursesAPI + "dept_id=" + input).then((response)=> {
			return response.json();
		}).then((myJson) => { for (i = 0; i < myJson.length; i++) {
						match = myJson[i].course_id.match(classRegExp);
						link = linkBase + match[1] + "/" + match[2];

						str += "<li><a class=\"#\" href=link role=\"button\">"
								+ myJson[i].course_id + "</a></li>";
					}
					ul.innerHTML = str;
		});
	}
	else {
		fetch(coursesAPI + "course_id=" + input + number).then((response)=> {
			return response.json();
		}).then((myJson) => {
					match = myJson[0].course_id.match(classRegExp);
					link = linkBase + match[1] + "/" + match[2];

					str += "<li><a class=\"#\" href=link role=\"button\">"
										+ myJson[0].course_id + "</a></li>";
					ul.innerHTML = str;
		});
	}
}
