/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdayfinder;

/**
 *
 * @author yohan
 */
public class BirthdayFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             String   Idnum = "952742680v";
        String year = Idnum.substring(0,2);
        String IdNumber = Idnum.substring(2,5);
        int day = Integer.parseInt(IdNumber);
        String gender="";
        String month="";
        
        
            if(day>0){
                if(day>500){
                    gender ="Female";
                    
                    day = day-500;
                }else if(day<500){
                    gender ="Male";
                    
                    day = day;
                }
                
                if(day>335){
                     month="December";
                    
                }else if(day>305){
                     month="November";
                        
                }else if(day>274){
                     month ="Octomber";
                }else if(day>244){
                    month ="September";
                }else if(day>213){
                    month="August";
                }else if(day>183){
                    month="July";
                }else if(day>152){
                    month="June";
                }else if(day>122){
                    month="May";
                }else if(day>91){
                    month="April";
                }else if(day>61){
                    month="March";
                }else if(day>31){
                    month="Febuary";
                }else if(day>1){
                    month="January";
                }
                
                
                System.out.println(gender+" "+month);
                
            }
        }
        
         
    }   
    
    

