
    class DepNoException extends RuntimeException {

        DepNoException() {
        super(" Your Department Number is under Working");
        }
        }
        interface collageName {
        String clgName = "DAVV";
        }
        class Teacher {
        String name;
        String Qualification;
        void detdataT(String name, String Qualification) {
        this.name = name;
        this.Qualification = Qualification;
        }
        }
        class department extends Teacher implements collageName {
        int deptNo;
        String deptName;
        void detdataD(int deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        }
        void checkDeptNo() {
        try {
        if (deptNo == 10 || deptNo == 20 || deptNo == 30) {
        throw new DepNoException();
        }
        } catch (DepNoException er) {
        er.printStackTrace();
        } finally {
        System.out.println("Teacher name is : " + name);
        System.out.println("Qualification is : " +
        
        Qualification);
        
        System.out.println("Department Name : " + deptName);
        System.out.println("Department Number : " + deptNo);
        }
        }
        }
         class Main2 {
        public static void main(String[] args) {
        
        department ob = new department();
        ob.detdataT("Sakshi ", "Bca");
        ob.detdataD(32, "It Department");
        ob.checkDeptNo();
        }
        }

