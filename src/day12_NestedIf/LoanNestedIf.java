package day12_NestedIf;

public class LoanNestedIf {
    public static void main(String[] args) {

        double minimumSalary = 50000;
        double jobHistory = 1;// must be 2 years
        int creditScore = 550;

      if (minimumSalary >= 30000){

          if (jobHistory >=2) {

              if (creditScore >= 600) {
                        System.out.println("You are qualified for a loan");
                    } else {
                  System.out.println("You must at least have 680 credit score");
                 }
              } else {
              System.out.println("You must be on the job at least for 2 years");
                    }

            }else{
                System.out.println("You must have minimum of 30K salary first");
            }
    }
}
/*   Muhtars github:

        if(minimumSalary >= 30000){

            if(jobHistory >=2){

                if(creditScore >= 680){
                    System.out.println("You are qualified for loan");
                }else{
                    System.out.println("You must have at least 680 credit score");
                }

            }else{
                System.out.println("You must be on the job at least for 2 years");
            }

        }else{
            System.out.println("You must have minimum of 30k salary first");
        }
    }
}
*/