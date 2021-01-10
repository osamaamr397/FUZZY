/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.util.Scanner;

public class Fuzzy {

    public static float FVL_Fuzzification(int funding, int vl[]) {
        float uvl = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (funding >= vl[0] && funding < vl[1]) {
            x1 = vl[0];
            y1 = 0;
            x2 = vl[1];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;

            uvl = (funding * a) + b;

        } else if (funding >= vl[1] && funding < vl[2]) {
            x1 = vl[1];
            y1 = 1;
            x2 = vl[2];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;

            uvl = (funding * a) + b;
        } else if (funding >= vl[2] && funding < vl[3]) {
            x1 = vl[2];
            y1 = 1;
            x2 = vl[3];
            y2 = 0;
            float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;

            uvl = (funding * a) + b;
        }
        return uvl;

    }

    public static float FL_Fuzzification(int funding, int l[]) {
        float ul = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (funding >= l[0] && funding < l[1]) {
            x1 = l[0];
            y1 = 0;
            x2 = l[1];
            y2 = 1;
            float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;

            ul = (funding * a) + b;

        } else if (funding >= l[1] && funding < l[2]) {
            x1 = l[1];
            y1 = 1;
            x2 = l[2];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;

            ul = (funding * a) + b;
        } else if (funding >= l[2] && funding < l[3]) {
            x1 = l[2];
            y1 = 1;
            x2 = l[3];
            y2 = 0;
                        
                                    
                                    float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;

            m = a * x1;
            b = y1 - m;
            ul = (funding * a) + b;
        }
        return ul;

    }

    public static float FM_Fuzzification(int funding, int M[]) {
        float um = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (funding >= M[0] && funding < M[1]) {
            x1 = M[0];
            y1 = 0;
            x2 = M[1];
            y2 = 1;
            float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            um = (funding * a) + b;

        } else if (funding >= M[1] && funding < M[2]) {
            x1 = M[1];
            y1 = 1;
            x2 = M[2];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            um = (funding * a) + b;
        } else if (funding >= M[2] && funding < M[3]) {
            x1 = M[2];
            y1 = 1;
            x2 = M[3];
            y2 = 0;
            float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            
            um = (funding * a) + b;
        }
        return um;

    }

    public static float FH_Fuzzification(int funding, int H[]) {
        float uh = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (funding >= H[0] && funding < H[1]) {
            x1 = H[0];
            y1 = 0;
            x2 = H[1];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            uh = (funding * a) + b;

        } else if (funding >= H[1] && funding < H[2]) {
            x1 = H[1];
            y1 = 1;
            x2 = H[2];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            uh = (funding * a) + b;
        } else if (funding >= H[2] && funding < H[3]) {
            x1 = H[2];
            y1 = 1;
            x2 = H[3];
            y2 = 0;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            uh = (funding * a) + b;
        }
        return uh;

    }

    public static float Ebeginner(int Experience, int beg[]) {
        float ub = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (Experience >= beg[0] && Experience < beg[1]) {
            x1 = beg[0];
            y1 = 0;
            x2 = beg[1];
            y2 = 1;
             float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ub = (Experience * a) + b;
        } else if (Experience >= beg[1] && Experience < beg[2]) {
            x1 = beg[1];
            y1 = 1;
            x2 = beg[2];
            y2 = 0;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ub = (Experience * a) + b;
        }
        return ub;
    }

    public static float Eintermediate(int Experience, int inter[]) {
        float ui = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (Experience >= inter[0] && Experience < inter[1]) {
            x1 = inter[0];
            y1 = 0;
            x2 = inter[1];
            y2 = 1;
            float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ui = (Experience * a) + b;
        } else if (Experience >= inter[1] && Experience < inter[2]) {
            x1 = inter[1];
            y1 = 1;
            x2 = inter[2];
            y2 = 0;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ui = (Experience * a) + b;
        }
        return ui;
    }

    public static float Eexpert(int Experience, int expert[]) {
        float ue = 0;
        int y1;
        int y2;
        int x1;
        int x2;
        float a, m, b;
        if (Experience >= expert[0] && Experience < expert[1]) {
            x1 = expert[0];
            y1 = 0;
            x2 = expert[1];
            y2 = 1;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ue = (Experience * a) + b;
        } else if (Experience >= expert[1] && Experience < expert[2]) {
            x1 = expert[1];
            y1 = 1;
            x2 = expert[2];
            y2 = 0;
            float miny=y2-y1;
                                    float minx=x2-x1;


            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ue = (Experience * a) + b;
        }
        return ue;
    }
    
    public static float Rule1(float uh,float ue){
        if(uh>ue){
            return uh;
        }
        return ue;
    }
    public static float Rule2(float um,float ui,float ub){
        float small;
        if(um<ui){
            small=um;
        }else{
            small=ui;
        }
        if(small>ub){
            return small;
        }
        return ub;
        
    }
    
    public static float Rule3(float uvl){
        return uvl;
    }
    public static float Rule4(float ul,float ub){
        if(ul<ub){
            return ul;
        }
        return ub;
    }
    
    public static float CalcAvg(int risk[]){
        float avg=0;
        float sum=0;
        for(int i=0;i<3;i++){
            sum+=risk[i];
        }
        avg=sum/3;
        return avg;
    }
    
    
    
    
    public static float LRisk(float result, int lowrisk[]) {
        float ulr = 0;
        float y1;
        float y2;
        float x1;
        float x2;
        float a, m, b;
        if (result >= lowrisk[0] && result < lowrisk[1]) {
            x1 = lowrisk[0];
            y1 = 0;
            x2 = lowrisk[1];
            y2 = 1;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ulr = (result * a) + b;
        } else if (result >= lowrisk[1] && result < lowrisk[2]) {
            x1 = lowrisk[1];
            y1 = 1;
            x2 = lowrisk[2];
            y2 = 1;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            ulr = (result * a) + b;
        }
        return ulr;
    }

    public static float MRisk(float result, int medrisk[]) {
        float umr = 0;
        float y1;
        float y2;
        float x1;
        float x2;
        float a, m, b;
        if (result >= medrisk[0] && result < medrisk[1]) {
            x1 = medrisk[0];
            y1 = 0;
            x2 = medrisk[1];
            y2 = 1;
            float miny=y2-y1;
            float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            umr = (result * a) + b;
        } else if (result >= medrisk[1] && result < medrisk[2]) {
            x1 = medrisk[1];
            y1 = 1;
            x2 = medrisk[2];
            y2 = 0;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            umr = (result * a) + b;
        }
        return umr;
    }

    public static float HRisk(float result, int highrisk[]) {
        float urh = 0;
        float y1;
        float y2;
        float x1;
        float x2;
        float a, m, b;
        if (result >= highrisk[0] && result < highrisk[1]) {
            x1 = highrisk[0];
            y1 = 0;
            x2 = highrisk[1];
            y2 = 1;
             float miny=y2-y1;
             float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            urh = (result * a) + b;
        } else if (result >= highrisk[1] && result < highrisk[2]) {
            x1 = highrisk[1];
            y1 = 1;
            x2 = highrisk[2];
            y2 = 0;
            float miny=y2-y1;
            float minx=x2-x1;
            a = miny / minx;
            m = a * x1;
            b = y1 - m;
            urh = (result * a) + b;
        }
        return urh;
    }
    
    
    

    public static void main(String[] args) {
        int vl[] = {0, 0, 10, 30};
        int l[] = {10, 30, 40, 60};
        int m[] = {40, 60, 70, 90};
        int h[] = {70, 90, 100, 100};
        int beg[] = {0, 15, 30};
        int inter[] = {15, 30, 45};
        int expert[] = {30, 60, 60};
        int LowR[]={50,100,100};
        int MedR[]={25,50,75};
        int HigR[]={0,25,50};
        int funding;
        int experience;
        float uvl,ul,um,uh,ub,ui,ue;
        Scanner input = new Scanner(System.in);
        int varsize;

        System.out.println("Enter number of variables");
        varsize = input.nextInt();
         System.out.print("Project Fund: ");
         funding=input.nextInt();
         System.out.print("Experience Level: ");
         experience=input.nextInt();
         
         uvl=FVL_Fuzzification(funding,vl);
         ul=FL_Fuzzification(funding,l);
         um=FM_Fuzzification(funding,m);
         uh=FM_Fuzzification(funding,h);
         ub=Ebeginner(experience,beg);
         ui=Eintermediate(experience,inter);
         ue=Eexpert(experience,expert);
         
          
        float FirstRule=Rule1(uh,ue);
        float SecRule=Rule2(um,ui,ub);
        float ThiRule=Rule3(uvl);
        float ForRule=Rule4(ul,ub);
       
        float RuleSum=FirstRule+SecRule+ThiRule+ForRule;
        
        float centroidLow=CalcAvg(LowR);
        float centroidMed=CalcAvg(MedR);
        float centroidHig=CalcAvg(HigR);     
        float z=(FirstRule*centroidLow+SecRule*centroidMed+ThiRule*centroidHig+centroidHig*ForRule)/RuleSum;
        System.out.println("Predicted Value (Risk)"+ z);
        
        
       
        
       float high=HRisk(z,HigR);
        float med=MRisk(z,MedR);
        float low=LRisk(z,LowR);
       System.out.println(high);
       System.out.println(med);
       System.out.println(low);

        
        if(low>high&&low>med){
             System.out.println("risk is low");
        }
        else if(med>low&&med>high){
            System.out.println("risk is normal");
        }
        else if(high>med&&high>low){
            System.out.println("risk is high");
        }

        }
    
    
    

    }



