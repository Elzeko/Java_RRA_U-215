package ru.vsuet.trainnavi.dommain;

public class Way {
    private String nameway;
    private String startpoint;
    private String finishpoint;
    private String interpoint;

        public void setName (String nameway) {
            this.nameway = nameway;
        }
        public String getName () {
            return nameway;
        }



        public void setNames (String startpoint) {
            this.startpoint = startpoint;
        }
        public String getNames () {
            return startpoint;
        }


        public void setNamef (String finishpoint) {
            this.finishpoint = finishpoint;
        }
        public String getNamef () {
            return finishpoint;
        }


        public void setNamei (String interpoint) {
            this.interpoint = interpoint;
        }
        public String getNamei () {
            return interpoint;
        }


}

