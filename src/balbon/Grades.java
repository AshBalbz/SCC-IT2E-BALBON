package balbon;

public class Grades {
    
        int sid;
        String sname;
        double sprelim, smidterm, sprefi, sfinals,ave;
    
    public void addGrades(int id, String sname, double p, double m, double pf, double f){
       
        this.sid = id;
        this.sname = sname;
        this.sprelim = p;
        this.smidterm = m;
        this.sprefi = pf;
        this.sfinals  = f;   
    }
    
    public void viewGrades(){
         ave = (this.sprelim + this.smidterm + this.sprefi + this.sfinals)/4;
         
        String rem = (ave>3.0) ? "Failed": "Passed";
        
        System.out.printf("\n%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s",
                           this.sid, this.sname, this.sprelim, this.smidterm, this.sprefi, this.sfinals, ave, rem);
        System.out.println("\n");
    }
} 

