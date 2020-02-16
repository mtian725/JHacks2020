import static spark.Spark.*;

public class Main {
	public static void main(String[] args) {
    
options("/*",
        (request, response) -> {

            String accessControlRequestHeaders = request
                    .headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers",
                        accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request
                    .headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods",
                        accessControlRequestMethod);
            }

            return "OK";
        });

    before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
    
    
    get("/", (req, res) -> "Hello World");
    get("/hello", (req, res) -> "Ohohoh!");
    
    get("/Professors", (req, res) -> {
			res.type("application/json");
			return "[{\"Category\":\"Instructors\"} , {\"Category\":\"God\"}]";
		});
    get("/Professors/Instructors", (req, res) -> {
			res.type("application/json");
			return "[{\"Professor\":\"Nelson Padua-Perez\" , \"Interest Areas\":\"is Papi\"}, {\"Professor\":\"Emad Fawzi\" , \"Interest Areas\":\"rides a motorcycle,looking for a life partner\"}]";
		});
    get("/Professors/God", (req, res) -> {
			res.type("application/json");
			return "{\"Professor\":\"Clyde Kruskal\" , \"Interest Areas\":\"Being God\"}";
		});
    
    
    /*************************************************
    **************************************************/
		
		get("/classes", (req, res) -> {
			res.type("application/json");
			return "[{\"name\":\"AMSC\"} , {\"name\":\"CMSC\"} , {\"name\":\"MATH\"} , {\"name\":\"STAT\"}]";
		});
    
    
    /*************************************************
    *         AMSC
    **************************************************/
		
		get("classes/AMSC", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"420\"} , {\"Course\":\"460\"} , {\"Course\":\"466\"} , {\"Course\":\"661\"}  , {\"Course\":\"666\"} , {\"Course\":\"667\"} , {\"Course\":\"674\"} ]";
		});
		get("classes/AMSC/420", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sa\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sam1.pdf\"}]}, {\"Exams\": [{\"quiz_name\": \"exam 1\",\"documentname\": \"Exam1AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sa\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2AMSC420\", \"link\": \"href= www.cs.umd.edu/~meesh/cmsc420/ContentBook/SampleBook/sam1/sam1.pdf\"} , {\"quiz_name\": \"Past Finals\",\"documentname\": \"PastFinalsAMSC420\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfm41U255LWRMTWsyZnRueF9YZ2NOTGJEZmtxSDNyRWRLeDVJN0JMWEprZUU\"}]}]";			
    });
		get("classes/AMSC/460", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC460\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfkdpVDBpUGhGQzJwWEpLRkN2c255Zmg1V2YySmdtcHZqQUd3WUNkRmo1cmM\"}]}]";
		});
		get("classes/AMSC/466", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC466\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfklKaDdxU211SHdOdmx4SkFvNlpfWXlaN0l4RTZVVWhxWWV2RVUyYjJNVFU\"}]}]";
		});
		get("classes/AMSC/661", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC661\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhY3ZtY1BSXzIzX1k\"}]}]";
		});
		get("classes/AMSC/666", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC664\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfjgxWFJHSVRNdk8yY2pMUm9TVkhEODlmX3o5aTZMeXlESmFIWk5pTTB4RFU\"}]}]";
		});
    		get("classes/AMSC/667", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC667\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfnRVQm9Yd002UDRyakhXb3pmMkFSbUdfUEZGOGQ4UHBzU3Q1a2pqVW9kWHM\"}]}]";
		});
    		get("classes/AMSC/670", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC689\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfkF3dkJLeE9mTUc3UFFzV1dYN2YwNnBTX2dtbnROUlpOUFNBTUxjX0lOTWs\"}]}]";
		});
    		get("classes/AMSC/671", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC689\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfnJZaDhCTkdoWkZIZHFscjZKTks0MktoZVBBRjV1dXZBQ3BVNllnbkVyQTg\"}]}]";
		});
    		get("classes/AMSC/673", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC689\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfkxlZ19TSzhMZHZDZVVZd1U2Y0dzTmtnQlN4X2FRTWVTWi1wUERFSkl6Wnc\"}]}]";
		});
		get("classes/AMSC/674", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsAMSC674\", \"link\": \"href= https://drive.google.com/drive/folders/0B9Iw6R7OblHhfk5JWC01eGdGX25acVNKQ0xsa1VvTk5fOWxSeEdwemx2aFhoNVRoUE9qVVE\"}]}]";
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
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
		get("classes/CMSC/122", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC122\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc122-0201/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC122\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc122-0201/quizzes/Worksheet2.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC122\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc122-0201/quizzes/Worksheet3.pdf\"}]} , {\"Exams\": [{\"quiz_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC122\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc122-0201/exams/exam1/\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC122\", \"link\": \"href= http://www.cs.umd.edu/class/fall2019/cmsc122-0201/exams/exam2/\"} , {\"quiz_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC122\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/final/\"}]}]";			
		});
		get("classes/CMSC/131", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet2.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet3.pdf\"} , {\"quiz_name\": \"Quiz4\",\"documentname\": \"Quiz4CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/quizzes/Worksheet4.pdf\"}]}, {\"Exams\": [{\"quiz_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/exam1/\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/exam2/\"} , {\"quiz_name\": \"Exam 3\",\"documentname\": \"Exam3CMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/exam3/\"} , {\"quiz_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC131\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc131-030X/exams/final/\"}]}]";			
		});
		get("classes/CMSC/132", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/DebuggingQuiz.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet3.pdf\"} , {\"quiz_name\": \"Quiz4\",\"documentname\": \"Quiz4CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet4.pdf\"}, {\"quiz_name\": \"Quiz5\",\"documentname\": \"Quiz5CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/quizzes/Worksheet5.pdf\"}]}, {\"Exams\": [{\"quiz_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/exam1/\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/exam2/\"} , {\"quiz_name\": \"Exam 3\",\"documentname\": \"Exam3CMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/exam3/\"} , {\"quiz_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC132\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc132/exams/final/\"}]}]";			
		});
		get("classes/CMSC/133", (req, res) -> {
			res.type("application/json");
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC133\", \"link\": \"href= www.cs.umd.edu/class/spring2020/cmsc133/quizzes/Worksheet1.pdf\"}]}]";			
		});
		get("classes/CMSC/216", (req, res) -> {
			res.type("application/json"); 
    return "[{\"Quizzes\": [{\"quiz_name\": \"Quiz1\",\"documentname\": \"Quiz1CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet1.pdf\"}, {\"quiz_name\": \"Quiz2\",\"documentname\": \"Quiz2CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet2.pdf\"}, {\"quiz_name\": \"Quiz3\",\"documentname\": \"Quiz3CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/debuggingQuiz.pdf\"} , {\"quiz_name\": \"Quiz4\",\"documentname\": \"Quiz4CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet4.pdf\"}, {\"quiz_name\": \"Quiz5\",\"documentname\": \"Quiz5CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/quizzes/Worksheet5.pdf\"}]},{\"Exams\": [{\"quiz_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/exam1/\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/exam2/\"} , {\"quiz_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC216\", \"link\": \"href= www.cs.umd.edu/class/summer2019/cmsc216/exams/final/\"}]}]";			
		});
		get("classes/CMSC/250", (req, res) -> {
			res.type("application/json");
      return "[{\"Reference Material\": [{\"quiz_name\": \"Reference1\",\"documentname\": \"ReferenceMaterialCMSC250\", \"link\": \"href=umd.instructure.com/courses/1246968/files/folder/ReferenceMaterial\"}, {\"quiz_name\": \"Reference2\",\"documentname\": \"SelfStudyCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/SelfStudyHandouts\"}, {\"quiz_name\": \"PastHomeworks\",\"documentname\": \"PastHomeworksCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/HomeworkAssignments\"} , {\"quiz_name\": \"LectureScans\",\"documentname\": \"LectureScansCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Eastman040xLectureScans\"}, {\"quiz_name\": \"DailyLecture\",\"documentname\": \"DailyLectureCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Eastman040xLectures\"}]}, {\"Exams\": [{\"quiz_name\": \"Exam 1 Final\",\"documentname\": \"Exam1FinalCMSC250\", \"link\": \"href=www.cs.umd.edu/class/summer2017/cmsc250/exams.html/\"}, {\"quiz_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Exams/Midterm1/\"} , {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Exams/Midterm2\"} , {\"quiz_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC250\", \"link\": \"href= umd.instructure.com/courses/1246968/files/folder/Exams/FinalPrep/\"}]}]";		
     });

		get("classes/CMSC/289A", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    
		get("classes/CMSC/320", (req, res) -> {
			res.type("application/json");
      return "[{\"Assignments\": [{\"quiz_name\": \"Assignments\",\"documentname\": \"AssignmentsCMSC320\", \"link\": \"href= cmsc320.github.io/#assignments\"}]}, {\"Resources\": [{\"other_resources\": \"Resources\",\"documentname\": \"ResourcesCMSC132\", \"link\": \"href= www.hcbravo.org/IntroDataSci/resources/\"}]}]";			
    });
    
		get("classes/CMSC/330", (req, res) -> {
			res.type("application/json");
      return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
    });
    
		get("classes/CMSC/351", (req, res) -> {
			res.type("application/json");
    return "[{\"Assignments\": [{\"quiz_name\": \"Homeworks\",\"documentname\": \"HomeworksCMSC351\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc351-0101/\"}]} , {\"Reference Material\": [{\"quiz_name\": \"Textbooks\",\"documentname\": \"TextbooksCMSC351\", \"link\": \"href= ianparberry.com/books/free/poa.pdf\"}]}, {\"Exams\": [{\"quiz_name\": \"Exam 1\",\"documentname\": \"Exam1CMSC351\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc351-0101/files/mid1-prac.pdf\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2CMSC351\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc351-0101/files/prac-midtermII.pdf\"} , {\"quiz_name\": \"Final Exam\",\"documentname\": \"FinalExamCMSC351\", \"link\": \"href= www.cs.umd.edu/class/fall2019/cmsc351-0101/files/prac-final.pdf\"}]}]";			
		});
    
		get("classes/CMSC/388J", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    
		get("classes/CMSC/411", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    
		get("classes/CMSC/412", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    
		get("classes/CMSC/414", (req, res) -> {
			res.type("application/json");
		return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    
		get("classes/CMSC/417", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    
		get("classes/CMSC/420", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    
		get("classes/CMSC/421", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    
		get("classes/CMSC/422", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
		get("classes/CMSC/423", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
		get("classes/CMSC/424", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  		});
    		get("classes/CMSC/425", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/426", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/430", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    		get("classes/CMSC/433", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/434", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/435", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/436", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/451", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    		get("classes/CMSC/452", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/454", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/456", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    		get("classes/CMSC/457", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/460", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    		get("classes/CMSC/466", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/470", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    		get("classes/CMSC/475", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    
    /*************************************************
    **************************************************/
		
    get("classes/MATH", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"015\"} , {\"Course\":\"107\"}  , {\"Course\":\"113\"} , {\"Course\":\"115\"} , {\"Course\":\"120\"} , {\"Course\":\"121\"} , {\"Course\":\"135\"} , {\"Course\":\"136\"} , {\"Course\":\"140\"} , {\"Course\":\"140H\"} , {\"Course\":\"141\"} , {\"Course\":\"141H\"} ,{\"Course\":\206\"} , {\"Course\":\"212\"} , {\"Course\":\"213\"} , {\"Course\":\"214\"} , {\"Course\":\"240\"} , {\"Course\":\"241\"} , {\"Course\":\"241H\"} , {\"Course\":\"246\"} , {\"Course\":\"246H\"} , {\"Course\":\"274\"} , {\"Course\":\"310\"} , {\"Course\":\"312\"} , {\"Course\":\"314\"} , {\"Course\":\"341\"} , {\"Course\":\"386\"}] , {\"Course\":\"400\"}, {\"Course\":\"401\"} , {\"Course\":\"402\"} , {\"Course\":\"403\"} , {\"Course\":\"404\"} , {\"Course\":\"405\"} , {\"Course\":\"406\"} , {\"Course\":\"410\"} , {\"Course\":\"411\"} , {\"Course\":\"416\"} , {\"Course\":\"424\"} , {\"Course\":\"430\"} , {\"Course\":\"437\"} , {\"Course\":\"446\"} , {\"Course\":\"456\"} , {\"Course\":\"461\"} , {\"Course\":\"462\"}  , {\"Course\":\"463\"} , {\"Course\":\"464\"} , {\"Course\":\"470\"} , {\"Course\":\"475\"} , {\"Course\":\"489\"}";
		});
        get("classes/MATH/015", (req, res) -> {
			res.type("application/json");
			return "[{\"Exams\": [{\"quiz_name\": \"Exam 1 \",\"documentname\": \"Quiz1MATH015\", \"link\": \"href=drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"}, {\"quiz_name\": \"Exam 2\",\"documentname\": \"Exam2MATH015\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"},{\"quiz_name\": \"Exam 3\",\"documentname\": \"Exam3MATH015\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8QXMwRS0zUTJWa28\"} ]}]";			
    });
        get("classes/MATH/107", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH107\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8dWlaZEdOcVJRWkE\"}]}]";
		});
        get("classes/MATH/113", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH113\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfl91OUY2dE1OTHJEdW9sTkhmX0dNWFFJVVRhalB4N2pqT3hkTml2MFpmdDQ\"}]}]";
		});
        get("classes/MATH/115", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH115\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnY5ck5SVkRFM1AweFdaS1poYzBiVDRTbTc2QVJvSEZNYVUwdXBwanhLT3c\"}]}]";
		});
    get("classes/MATH/120", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH120\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnY5ck5SVkRFM1AweFdaS1poYzBiVDRTbTc2QVJvSEZNYVUwdXBwanhLT3c\"}]}]";
		});
    get("classes/MATH/121", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH121\", \"link\": \"href= drive.google.com/drive/folders/0B6UIgUVIxqt8TTFhRG9PNlRhVzg\"}]}]";
		});
    get("classes/MATH/135", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH135\", \"link\": \"href= drive.google.com/drive/folders/11RLtLd6MTldIp7G2CVBEG73EUy2HqKiY\"}]}]";
		});
    get("classes/MATH/136", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH136\", \"link\": \"href= drive.google.com/drive/folders/1sZi9sF_Rwv7eEvkXd4wOVlTnLJVwkVZr\"}]}]";
		});
    get("classes/MATH/140", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH140\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfl9MS0kzQXFHY2hnY0VUVWFxR3ZUTkhkdnRPZnVBVnEwNlN0UUVCZ1puRmc\"}]}]";
		});
        get("classes/MATH/140H", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH140H\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjFVUkRfNjhWdlFKY2JoUVZpdmo1dHl6UXNIVjBMYk9nSUJnX0tvTFBMQ0k\"}]}]";
		});
    get("classes/MATH/141", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH141\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhflhoUE9DUVp5YmlBOHVvUjJSbk90bmpGOVJYdHZTYjZNRG9GMGtVMTZ5RmM\"}]}]";
		});
    get("classes/MATH/141H", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH141H\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmV6dmR4Y2lZUEZYYXFieF9WVllSSkZMNlRicFRtYmZrS21ER2VXd1o0U1U\"}]}]";
		});
    get("classes/MATH/206", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    get("classes/MATH/212", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH212\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjAySmQzYWU0S1M4QjdjNlVSVXJjb0RYNUt6M1ItN0x5RVZDaUltRVJGZ1U\"}]}]";
		});
    get("classes/MATH/213", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH213\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnNoeHAtUkQxcWNJa2VyVFZJWTJscXhPMHhvOVB6RXVYdjJrTjB5S1BUS00\"}]}]";
		});
    get("classes/MATH/214", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH214\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfm8tRUxNTktVRnpDZWtGU3BGLUc0bFJQOERXNGRIY0dRTGxWZFhjOVRkUGc\"}]}]";
		});
    get("classes/MATH/240", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH240\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmVta1FFR2Vka0ZuckpGWmtHSEQzcEN5NWtraEtVZkNkaG9TeTdoNll2dnM\"}]}]";
		});
    get("classes/MATH/241", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH241\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfkxnVVBpRHdER3d2YVBwMXQtRVpZQ3MtbWFnLWxqTDdZcVNjclE5X0x1OHc\"}]}]";
		});
    get("classes/MATH/241H", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH241H\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhflN1MmxkdVZzOUdNSHNVb0NFblhRenBhOURXamVTb2RPTk40UnFRS0ZhUlE\"}]}]";
		});
    get("classes/MATH/246", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH246\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfm0wdXQtUXpra1FnRXFEa3Fta3VRQVpoRnNYR283Y3ZHVG1ESEF1VGdsQ00\"}]}]";
		});
    get("classes/MATH/246H", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH246H\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjI1Zmh5WDFHVllMU21scnRYeUxKaGFoZ1I2OEQ1SHZFSG1TZFM5MVpZOU0\"}]}]";
		});
    get("classes/MATH/274", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH274\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfklHcWVEdG0tT2NOd1lhdGlHOGwtQnZXY3dCTGhoUl9BYmpETjJSeWVLX3c\"}]}]";
		});
    get("classes/MATH/310", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH310\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmJySUJJVGZUUm1oRjhHdVdTU3U1VUlOMmQ0WVpnTjJCeGs0bV8waUxzbHM\"}]}]";
		});
    get("classes/MATH/312", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH312\", \"link\": \"href= drive.google.com/drive/folders/10bDY1Ic222yptVmv_X2ewmvHBFyLfA4T\"}]}]";
		});
    get("classes/MATH/314", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH314\", \"link\": \"href= drive.google.com/drive/folders/13gJ-XsE_T5f-G5s1D_czWsX1BtLB8is-\"}]}]";
		});
    get("classes/MATH/341", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH341\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmNPa3h0Z3ZXOVJjajE1eXZlMTZvVHp5VHFFYnFQWUV0eTZNS0tTNVNqWkU\"}]}]";
		});
    get("classes/MATH/386", (req, res) -> {
			res.type("application/json");
      return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
      get("classes/MATH/400", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH400\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnRsWGZmTXdPd0lnZG9vWTFBWllzNWdhanJXLVNGbDNPSTVtVWpERXpYLWs\"}]}]";
		});
    get("classes/MATH/401", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH401\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfk9zam9yX3QtSDhNbDNqaVVwQ2sxSWJwWGozYkJHTE94WF9sOEMzUGdKMmc\"}]}]";
		});
    get("classes/MATH/402", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH402\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjVkQTFpTXg0RW82VVBXY1RuSWgwZUhkWk5ROF8wdkNHYTZUWDRHeFp4ZWc\"}]}]";
		});
    get("classes/MATH/403", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH403\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfkVwSzNxVGdBV21WRlpkTGNzVk9ZSFFMbUFCckJGX195MVlPMC1ZNUpONFk\"}]}]";
		});
    get("classes/MATH/404", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH404\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhflgzNDNaeDJOek40TVpSOFBUaXlXSXVGTWlnUU9hWDFkdTRJNjkwT3FmbGs\"}]}]";
		});
    get("classes/MATH/405", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH405\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfk5GRFVQX3VFeml0dmp1ZnptNlNRbWFGYnVkbTdmYnNXbVFnU2RyOVp6Vm8\"}]}]";
		});
    get("classes/MATH/406", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH406\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjVwN21qV2tUZmFya21tdUQzeGRzSndrQVgzbTRLc05ZTWsyRUxra0JiU2M\"}]}]";
		});
    get("classes/MATH/410", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH410\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhflBHMmxWNW1rcF9DTWVacnAtdTVjMnkwTVRRTWE0NFdxaURBdm9xX0dSRG8\"}]}]";
		});
    get("classes/MATH/411", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH411\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmhvTmFIR3dTaG1VMlF1b21RMjBjQ09PMFFucXFZSG1YTnppTUhYckZqcnM\"}]}]";
		});
    get("classes/MATH/424", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH424\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmtNVFpKS3Jha2FjUjZTM3BhbVVnM0h4cF9HWWE1SGFkc3N6MlhlaURYSFk\"}]}]";
		});
    get("classes/MATH/430", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH424\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfkFheW42YlM1SHJlVVVVTDQ0YWFvSVZ2dFpUc2pRTXc4R25uX0tXLVdfRFE\"}]}]";
		});
    get("classes/MATH/437", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    get("classes/MATH/446", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    get("classes/MATH/456", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
    get("classes/MATH/461", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
       get("classes/MATH/462", (req, res) -> {
			res.type("application/json");
		return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
       get("classes/MATH/463", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
       get("classes/MATH/464", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
       get("classes/MATH/470", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
       get("classes/MATH/475", (req, res) -> {
			res.type("application/json");
		return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  	});
       get("classes/MATH/489", (req, res) -> {
			res.type("application/json");
			return "[{\"Quizzes\": [{\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams1CMSC330\", \"link\": \"href= www.cs.umd.edu/class/spring2018/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams2CMSC330\", \"link\": \"href= www.cs.umd.edu/class/fall2017/cmsc330/#exams\"}, {\"quiz_name\": \"QuizzesExams\",\"documentname\": \"QuizzesAndExams3CMSC330\", \"link\": \"href= www.cs.umd.edu/class/summer2017/cmsc330/tests.shtml\"}]}]";			
  });
    /*************************************************
    **************************************************/
		get("classes/STAT", (req, res) -> {
			res.type("application/json");
			return "[{\"Course\":\"100\"} , {\"Course\":\"400\"} , {\"Course\":\"401\"} ,  {\"Course\":\"405\"} ,{\"Course\":\"410\"} , {\"Course\":\"420\"}  ,  {\"Course\":\"430\"} , {\"Course\":\"440\"} , {\"Course\":\"464\"} , {\"Course\":\"470\"} , {\"Course\":\"600\"} , {\"Course\":\"601\"} , {\"Course\":\"650\"} , {\"Course\":\"701\"} , {\"Course\":\"740\"} , {\"Course\":\"741\"}]";
		});
       get("classes/STAT/100", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH100\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjdKNFZyeEZYM2V3OE96SHZ2VnBzNEl2X2VESFdGdE1yczVWTVItTjNMcGc\"}]}]";
		});
       get("classes/STAT/400", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH400\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjV4UjBocEwwRzB5VjBlMU11Wl9lZ0ZoOVlHQmZweTNINlpDVHVPaUl4bnM\"}]}]";
		});
       get("classes/STAT/401", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH401\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjc3anJrNm9vZ2t4SkFLT3ZFa21KQmw3cG1jeEJJYW9jUmNuZy1idU5Hb3c\"}]}]";
		});
           get("classes/STAT/405", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH405\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfk93X012a1dlX01oWG92VFIzZHhkWlhkbGZ5d3hIY2w5VVJjQmo3VDRaOUk\"}]}]";
		});
       get("classes/STAT/410", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH410\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmZYVW9YX1plLTY2Y1E2Z19OaGtsUmNfSFdwalU3TWxucW9ILURLSnZLN1U\"}]}]";
		});
       get("classes/STAT/420", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH420\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmxLRGN6RnVFTHlqQi1BeVFWUjJOa3doelY5cVk0SWJ4bmlfRTdkUUUwT3c\"}]}]";
		});
       get("classes/STAT/430", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH430\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfkFheW42YlM1SHJlVVVVTDQ0YWFvSVZ2dFpUc2pRTXc4R25uX0tXLVdfRFE\"}]}]";
		});
       get("classes/STAT/440", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH440\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjRKSmNXMFhyY1dFNkttcUh3NERMaW9BakVWWVRRdndRb1hFVzFkdTdrcWs\"}]}]";
		});
       get("classes/STAT/464", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH464\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfnF2c2pUUHdTWFdKRm9xSXVzckNTZUx0ZDVLc1MxZ1FLRTBsWEItVkQ5QVk\"}]}]";
		});
       get("classes/STAT/470", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH470\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmJrUW1xMGNJbnUwXzU4cjhGVlNlQ1BFZnVmeUZNdmpCM08wUFBIdTFUUVE\"}]}]";
		});
          get("classes/STAT/600", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH600\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjZnZy1OUzExeE5BUUVvN3BMVDFUMk9Ncngya3N4LUpPZjZvS0o3UTNMQ1k\"}]}]";
		});
       get("classes/STAT/601", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH601\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjVhZEJKbXVfRlVCWXhpT200Q1hOQ3E3aWxEcFlwRnNMdVNxRkk3ZUlmZ2c\"}]}]";
		});
       get("classes/STAT/650", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH650\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhflR0Z2J1c04xOU9XMmRUQktZMktoa3ItZEVjQWc5Q0xrRHpGMHVaeTJud28\"}]}]";
		});
       get("classes/STAT/701", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH701\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfjhUUF9LQUZMWEt0MzVycm95bFJXMkdhLS0tUFhzbUJGZ2s3R1d3djlVbzg\"}]}]";
		});
       get("classes/STAT/740", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH740\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmhRaHJtaFkwZ1QtaEVEQ0FvM3R1S0djYnc4Q1RtcFdwbW9qbnF5ZUEtRjA\"}]}]";
		});
       get("classes/STAT/741", (req, res) -> {
			res.type("application/json");
      return "[{\"Exams\": [{\"quiz_name\": \"PastFinals\",\"documentname\": \"PastFinalsMATH741\", \"link\": \"href= drive.google.com/drive/folders/0B9Iw6R7OblHhfmhRaHJtaFkwZ1QtaEVEQ0FvM3R1S0djYnc4Q1RtcFdwbW9qbnF5ZUEtRjA\"}]}]";
		});

	}
}
