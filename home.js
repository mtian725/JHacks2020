function search() {
	var input = document.getElementById("search").value;
	const coursesAPI = "https://api.umd.io/v0/courses?";
	const ul = document.getElementById("class_list");
	var str = "";

	fetch(coursesAPI + "dept_id=" + input).then((response)=> { response.json(); });
}


