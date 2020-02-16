function search() {
	var input = document.getElementById("search").value;
	var number = document.getElementById("number").value;
	const coursesAPI = "https://api.umd.io/v0/courses?";
	const ul = document.getElementById("class_list");
	str = "";

	if (number==="") {
		fetch(coursesAPI + "dept_id=" + input).then((response)=> {
			return response.json();
		}).then((myJson) => { for (i = 0; i < myJson.length; i++) {
						str += "<li>"	+ myJson[i].course_id + "</li>";
					}
					ul.innerHTML = str;
		});
	}
	else {
		fetch(coursesAPI + "course_id=" + input + number).then((response)=> {
			return response.json();
		}).then((myJson) => {
					str += "<li>" + myJson[0].course_id + "</li>";
					ul.innerHTML = str;
		});
	}
}

function selectClass(event){
	const linkBase = "https://jhacks2020.glitch.me/classes/";
	const classRegExp = /^([A-Z]{4})([0-9]{3}[A-Z]?)$/;
	link = "";
	match = event.target.innerHTML.match(classRegExp);
	link = linkBase + match[1] + "/" + match[2];
	fetch(link).then((response)=> {
		return response.json();
	}).then((myJson) => {
			console.log(myJson);
	});
}
