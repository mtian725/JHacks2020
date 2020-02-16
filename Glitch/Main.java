import static spark.Spark.*;

public class Main {
	public static void main(String[] args) {
    get("/Professors", (req, res) -> {
			res.type("application/json");
			return "[{\"Category\":\"Men\"} , {\"Category\":\"God\"}]";
		});
    get("/Professors/Men", (req, res) -> {
			res.type("application/json");
			return "[{\"Professor\":\"Clyde Kruskal\" , \"Title\":\"God\"}, {\"Professor\":\"Clyde Kruskal\" , \"Title\":\"God\"}, {\"Professor\":\"Clyde Kruskal\" , \"Title\":\"God\"}]";
		});
    get("/Professors/God", (req, res) -> {
			res.type("application/json");
			return "{\"Professor\":\"Clyde Kruskal\" , \"Title\":\"God\"}";
		});


    /*************************************************
    **************************************************/

		get("/classes", (req, res) -> {
			res.type("application/json");
			return "[{\"name\":\"AMSC\"} , {\"name\":\"CMSC\"} , {\"name\":\"MATH\"} , {\"name\":\"STAT\"}]";
		});

    /*************************************************
    *
    **************************************************/

		get("classes/AMSC", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"420\"} , {\"Course\":\"460\"} , {\"Course\":\"466\"} , {\"Course\":\"498A\"} , {\"Course\":\"661\"}  , {\"Course\":\"664\"} , {\"Course\":\"674\"} , {\"Course\":\"689\"} ]";
		});
		get("classes/AMSC/420", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sa\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sam1.pdf\"}]}, {\"Exams\": [{\"exam_name\": \"exam 1\",\"documentname\": \"Exam1AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sa\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sam1.pdf\"}]}]";
    });

		get("classes/AMSC/460", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"quiz_name\": \"Quizz 1\", \"documentname\": \"Quiz1AMSC460\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet1.pdf\"}, {\"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/AMSC/466", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/AMSC/489A", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/AMSC/661", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/AMSC/664", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/AMSC/674", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/AMSC/689", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

    /*************************************************
    *
    **************************************************/

		get("classes/CMSC", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"106\"} , {\"Course\":\"122\"} , {\"Course\":\"131\"} , {\"Course\":\"132\"} , {\"Course\":\"133\"}  , {\"Course\":\"216\"} , {\"Course\":\"250\"} , {\"Course\":\"298A\"} , {\"Course\":\"320\"} , {\"Course\":\"330\"} , {\"Course\":\"351\"} , {\"Course\":\"388J\"} , {\"Course\":\"411\"} , {\"Course\":\"412\"} , {\"Course\":\"414\"} , {\"Course\":\"417\"} , {\"Course\":\"420\"} , {\"Course\":\"421\"} , {\"Course\":\"422\"} , {\"Course\":\"423\"} , {\"Course\":\"424\"}, {\"Course\":\"425\"} , {\"Course\":\"426\"} , {\"Course\":\"430\"} , {\"Course\":\"433\"} , {\"Course\":\"434\"} , {\"Course\":\"435\"}] , {\"Course\":\"436\"} , {\"Course\":\"451\"} , {\"Course\":\"452\"} , {\"Course\":\"454\"} , {\"Course\":\"456\"} , {\"Course\":\"457\"} , {\"Course\":\"460\"} , {\"Course\":\"466\"} , {\"Course\":\"470\"} , {\"Course\":\"475\"}";
		});
		get("classes/CMSC/106", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/CMSC/122", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/CMSC/131", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet2.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet3.pdf\"} , {\"quiz_name\": \"Quiz4\",\"documentname\": \"Quiz4CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet4.pdf\"}]}, {\"Exams\": [{\"exam_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/exam1/\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/exam2/\"} , {\"exam_name\": \"Exam 3\",\"documentname\": \"Exam3CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/exam3/\"} , {\"exam_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/final/\"}]}]";
		});
		get("classes/CMSC/132", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/DebuggingQuiz.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet3.pdf\"} , {\"quiz_name\": \"Quiz4\",\"documentname\": \"Quiz4CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet4.pdf\"}, {\"quiz_name\": \"Quiz5\",\"documentname\": \"Quiz5CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet5.pdf\"}]}, {\"Exams\": [{\"exam_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/exam1/\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/exam2/\"} , {\"exam_name\": \"Exam 3\",\"documentname\": \"Exam3CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/exam3/\"} , {\"exam_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/final/\"}]}]";
		});
		get("classes/CMSC/133", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC133\", \"link\": \"href= www.cs.umd.edu/class/spring2020/cmsc133/quizzes/Worksheet1.pdf\"}]}]";
		});
		get("classes/CMSC/216", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet2.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/debuggingQuiz.pdf\"} , {\"quiz_name\": \"Quiz4\",\"documentname\": \"Quiz4CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet4.pdf\"}, {\"quiz_name\": \"Quiz5\",\"documentname\": \"Quiz5CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet5.pdf\"}]},{\"Exams\": [{\"exam_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/exam1/\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/exam2/\"} , {\"exam_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/final/\"}]}]";
		});
		get("classes/CMSC/250", (req, res) -> {
			res.type("application/json");
      return "[{\"Reference Material\": [{\"reference_material\": \"Reference1\",\"documentname\": \"ReferenceMaterialCMSC250\", \"link\": \"href=umd.instructure.com/courses/1246968/files/folder/ReferenceMaterial\"}, {\"reference_material\": \"Reference2\",\"documentname\": \"SelfStudyCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/SelfStudyHandouts\"}, {\"reference_material\": \"PastHomeworks\",\"documentname\": \"PastHomeworksCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/HomeworkAssignments\"} , {\"reference_material\": \"LectureScans\",\"documentname\": \"LectureScansCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Eastman040xLectureScans\"}, {\"reference_material\": \"DailyLecture\",\"documentname\": \"DailyLectureCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Eastman040xLectures\"}]}, {\"Exams\": [{\"exam_name\": \"Exam 1 Final\",\"documentname\": \"Exam1FinalCMSC250\", \"link\": \"href=www.cs.umd.edu/class/summer2017/cmsc250/exams.html/\"}, {\"exam_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Exams/Midterm1/\"} , {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Exams/Midterm2\"} , {\"exam_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Exams/FinalPrep/\"}]}]";
     });

		get("classes/CMSC/289A", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/320", (req, res) -> {
			res.type("application/json");
      return "[{\"Assignments\": [{\"assignments\": \"Assignments\",\"documentname\": \"AssignmentsCMSC320\", \"link\": \"href= cmsc320.github.io/#assignments\"}]}, {\"Resources\": [{\"other_resources\": \"Resources\",\"documentname\": \"ResourcesCMSC132\", \"link\": \"href= www.hcbravo.org/IntroDataSci/resources/\"}]}]";
    });

		get("classes/CMSC/330", (req, res) -> {
			res.type("application/json");
      return "[{\"Quizzes/Exams\": [{\"quizzes_exams\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";
    });

		get("classes/CMSC/351", (req, res) -> {
			res.type("application/json");
    return "[{\"Homeworks\": [{\"homeworks\": \"Homeworks\",\"documentname\": \"HomeworksCMSC351\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc351-0101/\"}]} , {\"Textbooks\": [{\"textbooks\": \"Textbooks\",\"documentname\": \"TextbooksCMSC351\", \"link\": \"href= http://ianparberry.com/books/free/poa.pdf\"}]}, {\"Exams\": [{\"exam_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC351\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc351-0101/files/mid1-prac.pdf\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC351\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc351-0101/files/prac-midtermII.pdf\"} , {\"exam_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC351\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc351-0101/files/prac-final.pdf\"}]}]";
		});

		get("classes/CMSC/388J", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/411", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/412", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/414", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/417", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/420", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/421", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

		get("classes/CMSC/422", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/CMSC/423", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
		get("classes/CMSC/424", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/425", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/426", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/430", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/433", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/434", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/435", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/436", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/451", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/452", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/454", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/456", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/457", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/460", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/466", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/470", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    		get("classes/CMSC/475", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

    /*************************************************
    **************************************************/

    get("classes/MATH", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"003\"} , {\"Course\":\"007\"} , {\"Course\":\"013\"} , {\"Course\":\"015\"} , {\"Course\":\"107\"}  , {\"Course\":\"113\"} , {\"Course\":\"115\"} , {\"Course\":\"120\"} , {\"Course\":\"121\"} , {\"Course\":\"135\"} , {\"Course\":\"136\"} , {\"Course\":\"140\"} , {\"Course\":\"140H\"} , {\"Course\":\"141\"} , {\"Course\":\"141H\"} ,{\"Course\":\206\"} , {\"Course\":\"212\"} , {\"Course\":\"213\"} , {\"Course\":\"214\"} , {\"Course\":\"240\"} , {\"Course\":\"241\"} , {\"Course\":\"241H\"} , {\"Course\":\"246\"} , {\"Course\":\"246H\"} , {\"Course\":\"274\"} , {\"Course\":\"310\"} , {\"Course\":\"312\"} , {\"Course\":\"314\"} , {\"Course\":\"341\"} , {\"Course\":\"386\"}] , {\"Course\":\"401\"} , {\"Course\":\"402\"} , {\"Course\":\"403\"} , {\"Course\":\"404\"} , {\"Course\":\"405\"} , {\"Course\":\"406\"} , {\"Course\":\"410\"} , {\"Course\":\"411\"} , {\"Course\":\"416\"} , {\"Course\":\"420\"} , {\"Course\":\"424\"} , {\"Course\":\"430\"} , {\"Course\":\"437\"} , {\"Course\":\"446\"} , {\"Course\":\"456\"} , {\"Course\":\"461\"} , {\"Course\":\"462\"}  , {\"Course\":\"463\"} , {\"Course\":\"464\"} , {\"Course\":\"470\"} , {\"Course\":\"475\"} , {\"Course\":\"489\"}";
		});
    get("classes/MATH/003", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sa\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sam1.pdf\"}]}, {\"Exams\": [{\"exam_name\": \"exam 1\",\"documentname\": \"Exam1AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sa\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sam1.pdf\"}]}]";
    });
    get("classes/MATH/007", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/013", (req, res) -> {
			res.type("application/json");
			return "[{\"Exams\": [{\"Exam_name\": \"Exam 1 \",\"documentname\": \"Quiz1MATH015\", \"link\": \"href=drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2MATH015\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"},{\"exam_name\": \"Exam 3\",\"documentname\": \"Exam3MATH015\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"} ]}]";
    });

        get("classes/MATH/015", (req, res) -> {
			res.type("application/json");
			return "[{\"Exams\": [{\"Exam_name\": \"Exam 1 \",\"documentname\": \"Quiz1MATH015\", \"link\": \"href=drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"}, {\"exam_name\": \"Exam 2\",\"documentname\": \"Exam2MATH015\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"},{\"exam_name\": \"Exam 3\",\"documentname\": \"Exam3MATH015\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"} ]}]";
    });
        get("classes/MATH/107", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH107\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8dWlaZEdOcVJRWkE\"}]}]";
		});
        get("classes/MATH/113", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH113\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfl91OUY2dE1OTHJEdW9sTkhmX0dNWFFJVVRhalB4N2pqT3hkTml2MFpmdDQ\"}]}]";
		});
        get("classes/MATH/115", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH115\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnY5ck5SVkRFM1AweFdaS1poYzBiVDRTbTc2QVJvSEZNYVUwdXBwanhLT3c\"}]}]";
		});
    get("classes/MATH/120", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH120\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnY5ck5SVkRFM1AweFdaS1poYzBiVDRTbTc2QVJvSEZNYVUwdXBwanhLT3c\"}]}]";
		});
    get("classes/MATH/121", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH121\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8TTFhRG9PNlRhVzg\"}]}]";
		});
    get("classes/MATH/135", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH135\", \"link\": \"href= drive.google.com/drive/folders/11RLtLd6MTldIp7G2CVBEG73EUy2HqKiY\"}]}]";
		});
    get("classes/MATH/136", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH136\", \"link\": \"href= drive.google.com/drive/folders/1sZi9sF_Rwv7eEvkXd4wOVlTnLJVwkVZr\"}]}]";
		});
    get("classes/MATH/140", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH140\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfl9MS0kzQXFHY2hnY0VUVWFxR3ZUTkhkdnRPZnVBVnEwNlN0UUVCZ1puRmc\"}]}]";
		});
        get("classes/MATH/140H", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH140H\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjFVUkRfNjhWdlFKY2JoUVZpdmo1dHl6UXNIVjBMYk9nSUJnX0tvTFBMQ0k\"}]}]";
		});
    get("classes/MATH/141", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH141\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhflhoUE9DUVp5YmlBOHVvUjJSbk90bmpGOVJYdHZTYjZNRG9GMGtVMTZ5RmM\"}]}]";
		});
    get("classes/MATH/141H", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH141H\", \"link\": \"href= \"}]}]";
		});
    get("classes/MATH/206", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/212", (req, res) -> {
			res.type("application/json");
      return "[{\"Past Finals\": [{\"past_finals\": \"PastFinals\",\"documentname\": \"PastFinalsMATH136\", \"link\": \"href= \"}]}]";
		});
    get("classes/MATH/213", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/214", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/240", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/241", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/241H", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/246", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/246H", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/274", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/310", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/312", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/314", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/341", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/386", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/401", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/402", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/403", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/404", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/405", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/406", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/410", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/411", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/420", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/424", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/430", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/437", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/446", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/456", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    get("classes/MATH/461", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/MATH/462", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/MATH/463", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/MATH/464", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/MATH/470", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/MATH/475", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/MATH/489", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    /*************************************************
    **************************************************/
		get("classes/STAT", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"100\"} , {\"Course\":\"400\"} , {\"Course\":\"401\"} , {\"Course\":\"410\"} , {\"Course\":\"420\"}  , {\"Course\":\"426\"} , {\"Course\":\"430\"} , {\"Course\":\"440\"} , {\"Course\":\"464\"} , {\"Course\":\"470\"} , {\"Course\":\"498\"} , {\"Course\":\"498A\"} , {\"Course\":\"601\"} , {\"Course\":\"650\"} , {\"Course\":\689\"} , {\"Course\":\"701\"} , {\"Course\":\"730\"} , {\"Course\":\"741\"} , {\"Course\":\"799\"}";
		});
       get("classes/STAT/100", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/400", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});

       get("classes/STAT/401", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/410", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/420", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/426", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/430", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/440", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/464", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/470", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/498", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/498A", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/601", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/650", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/689", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/701", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/730", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/741", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
       get("classes/STAT/799", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\":[\"Quizz 1\", \"Quizz 2\",\"Quizz 3\"]} , {\"EXAMS\":[\"EXAM 1\", \"Exam 2\",\"EXAM 3\"]} , {\"HOMEWORKS\":[\"HOMEWORK 1\", \"HOMEWORK 2\",\"HOMEWORK 3\"]} ]";
		});
    /*
    get("professors/", (req, res)->){
      res.type("application/json");
      return "[{\""}]"
    }*/
	}
}
