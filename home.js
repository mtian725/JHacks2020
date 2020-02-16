function search() {
	var input = document.getElementById("search").value;
	var number = document.getElementById("number").value;
	const coursesAPI = "https://api.umd.io/v0/courses?";
	const ul = document.getElementById("class_list");
	var str = "";

	if (number==="") {
		fetch(coursesAPI + "dept_id=" + input).then((response)=> {
			return response.json();
		}).then((myJson) => { for (var i = 0; i < myJson.length; i++) {
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
	var link = "";
	var match = event.target.innerHTML.match(classRegExp);
	var link = linkBase + match[1] + "/" + match[2];
  console.log(link);
	fetch(link).then((response)=> {
		return response.json();
	}).then((myJson) => {

			var curatedJson = myJson;

			var display = document.getElementById("info");
			var str = "";
			str += "<h2>" + event.target.innerHTML + " : ";
			out = fetch("https://api.umd.io/v0/courses?course_id=" +
						event.target.innerHTML).then((response)=> {
				return response.json();
			}).then((myJson) => {

					console.log(curatedJson);
					str += myJson[0].name + "</h2>";

					for (key in curatedJson) {
						for (ke in curatedJson[key]) {
							str += "<h3>" + ke + "</h3>";
							for (k in curatedJson[key][ke]) {
								str += "<p><a "+curatedJson[key][ke][k]["link"]+">"+curatedJson[key][ke][k]["quiz_name"]+"</a></p>";
							}
						}
					}

					display.innerHTML = str;
			});

	});
}
