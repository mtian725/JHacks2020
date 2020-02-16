function search() {
	var input = document.getElementById("search").value;
	const coursesAPI = "https://api.umd.io/v0/courses?";
	const ul = document.getElementById("class_list");
	var str = "";

	fetch(coursesAPI + "dept_id=" + input).then((response)=> { 
		return response.json();
	}).then((myJson) => { for (i = 0; i < myJson.length; i++) {
					str += "<li>" + myJson[i].course_id + "</li>";
				}
				ul.innerHTML = str;
	});
}	


