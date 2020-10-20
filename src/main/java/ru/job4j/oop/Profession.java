package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEducation(){
        return education;
    }

    public String getBirthday(){
        return birthday;
    }

    public class Doctor extends Profession{
        public String kindOfActivity;
        public String instruments;
        public String pacients;

        public void operations(){
            ;
        }
    }

    public class Engeneer extends Profession{
        public String matters;
        public String WorkPlace;

        public void doIt(){
            ;
        }

     public class Surgeon extends Doctor{
            public String WorkTime;
            public String bodypart;

     }

     public class Dentist extends Doctor{
            public String denture;               // зубной протез
     }

     public class Programmer extends Engeneer{
            public String iqLevel;
     }

     public class Builder extends Engeneer{
            public String armStrength;
     }




}
