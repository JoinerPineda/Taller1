//Joiner Pineda
public class gradeBook {

        public String displayMesage(){
            return "Bienvenido al curso de : " + getCourseName();
        }
        private String courseName;

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    }
