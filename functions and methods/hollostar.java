import java.util.Scanner;

public class hollostar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of rows : ");
        int torows = sc.nextInt();
       

        holow(torows);
        System.out.println("\n\n\n\n");

        invertedstar(torows);
        System.out.println("\n\n\n\n");


        invertednumber(torows);
        System.out.println("\n\n\n\n");


        floyd(torows);
        System.out.println("\n\n\n\n");


        onezero(torows);
        System.out.println("\n\n\n\n");


        butterfly(torows);
        System.out.println("\n\n\n\n");


        rhombus(torows);
        System.out.println("\n\n\n\n");

        hollorhombus(torows);
        System.out.println("\n\n\n\n");


        diamond(torows);
        System.out.println("\n\n\n\n");



            

                
        }
        public static void holow(int torows)
        {
            for(int i = 1; i<=torows ; i++)
            {
                for(int j = 1; j <= torows; j++)
                {
                    if (i==1 || i==torows || j==1 || j==torows ) 
                    {
                        System.out.print("*");
                        
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        /*for inverted rotated star pattern 
                        * 
                       ** 
                      *** 
                     **** 

        */
        public static void invertedstar(int torows)
        {
            for(int i = 1; i<=torows; i++)
            {
                for(int j = 1; j<=torows-i; j++)
                {
                    System.out.print(" ");
                }
                for(int j = 1; j<=i ; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        /* for inverted number patter 12345
                                      1234
                                      123
                                      12
                                      1

         */

        public static void invertednumber(int torows)
        {
            for(int i = 1; i<=torows+1; i++)
            {
                for(int j = 1; j<=torows-i+1 ; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        /* floyd's triangle 1 
                            2 3 
                            4 5 6 
                            7 8 9 
                            10 11 12 
                            13 14 15 16  */

            public static void floyd(int torows)
            {
                int counter = 1;
                for(int i = 1; i<=torows; i++)
                {
                    for(int j = 1; j<=i; j++)
                    {
                        System.out.print(counter+" ");
                        counter++;
                    }
                    System.out.println();
                }
            }


            /* 1 0 form triangle 1 
                                 10 
                                 101 
                                 1010 
                                 10101 
             */

        public static void onezero(int torows)
        {
            for(int i = 1; i <=torows; i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print("1 ");
                    }
                    else
                    {
                        System.out.print("0 ");

                    }
                    
                }
                System.out.println();
            }
        }



        /* for printing butterfly patter 
                                            *        *
                                            **      **
                                            ***    ***
                                            ****  ****
                                            **********
                                            **********
                                            ****  ****
                                            ***    ***
                                            **      **
                                            *        *
                                                             */

        public static void butterfly(int torows)
        {
            //first half
            for(int i = 1 ; i<=torows; i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print("*"); //for printing star
                }
                for(int j = 1; j<=2*(torows-i); j++) 
                {
                    System.out.print(" ");   //for printing spaces
                }
                for(int j = 1; j<=i; j++ )
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            //2nd half
            for(int i = torows ; i>=1; i--)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print("*");  //for printing stars
                }
                for(int j = 1; j<=2*(torows-i); j++)
                {
                    System.out.print(" "); //for printing spaces
                }
                for(int j = 1; j<=i; j++ )
                {
                    System.out.print("*");   //for printing stars
                }
                System.out.println();
                
            }
        }


        /* for printing rhombus patters 
                                            *****
                                           *****
                                          *****
                                         *****
                                        ***** 

         */

        public static void rhombus(int torows)
        {
            for(int i = 1; i <= torows; i++)
            {
                for(int j = 1; j <=(torows-i); j++)
                {
                    System.out.print(" ");

                }
                for(int j = 1; j <= torows; j++)
                {
                    System.out.print("*");

                }
                System.out.println();
            }
        }


        /* printing hollow rhombus */


        public static void hollorhombus(int torows)
        {
            for(int i =1; i<=torows; i++)
            {
                for(int j = 1; j<=(torows-i); j++)
                {
                    System.out.print(" ");

                }
                for(int j=1; j<=torows; j++)
                {
                    if (i==1 || i==torows || j==1 || j==torows) 
                    {
                        System.out.print("*");
                        
                    }
                    else
                    {
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }

        }


        /* for printing diamond pattern  */



        public static void diamond(int torows)
        {
            for(int i = 1; i<= torows; i++)         //first half
            {
                for(int j=1; j<=(torows-i); j++)
                {
                  System.out.print(" ");        //for printing spaces of diamond
                }
                for(int j = 1; j<=(2*i)-1; j++)
                {
                    System.out.print("*");          //for printing stars of diamond pattern
                }
                System.out.println();

            }

            for(int i=torows; i>=1; i--)                //2nd half
            {
                for(int j=1; j<=(torows-i); j++)
                {
                  System.out.print(" ");
                }
                for(int j = 1; j<=(2*i)-1; j++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
        }

    }

