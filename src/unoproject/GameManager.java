/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

/**
 *
 * @author Japne
 */
public class GameManager
{
    
    private int State = 0;
	private Input input = new Input(System.in);
	private Command command = new Command();
	
	public boolean readCommands()
        {
	String[] fields;
		
	while(true)
        {
            System.out.print("> ");
            fields = input.readFields();
			
            if(fields.length < 1 || fields.length > 4)
            {
		continue;
            }
			
            for(int i = 0; i < fields.length; i++)
            {
		fields[i] = fields[i].toUpperCase();
            }	
		
            if(fields[0].equals("EXIT"))
            {
		return false;
            }	
			
            switch(this.State)
            {
		case 0:
		switch(fields[0])
                {		
                    case "PLAY":
                    if(fields.length < 2)
                    {
			System.out.println("HEY, YOU FORGOT TO CHOOSE A CARD.");
			break;
                    }
							
                    if(this.command.playCard(fields) == false)
                    {
			System.out.println("TRY AGAIN.");
                    }
                    else
                    {
                        if(this.command.verifyEndGame())
                        {
                            return true;
                        }
								
			if(fields.length == 4 && fields[2].equals("UNO"))
                        {
                            this.command.pass(true);
                        }
			
                        else if(fields.length == 3 && fields[2].equals("UNO"))
                        {
                            this.command.pass(true);
                        }
			
                        else
                        {
                            this.command.pass(false);
                        }
                    }
							
                    this.State = 0;
                    break;
							
                    case "DRAW":
                    this.command.draw();
                    this.State = 1;
                    break;
							
                    case "PASS":
                    System.out.println("YOU SHALL NOT PASS.");
                    this.State = 0;
                    break;
							
                    default:
                    System.out.println("I COULDN'T UNDERSTANT YOU.");
                    break;
                }
                break;
				
                case 1:
		
                switch(fields[0].toUpperCase())
                {
                    case "PLAY":
			if(this.command.playCard(fields) == false)
                        {
                            System.out.println("TRY AGAIN");
			}
                        else 
                        {
                            this.State = 0;
                        }    

			if(this.command.verifyEndGame())
                        {
                            return true;
                        }
								
			if(fields.length == 4 && fields[2].equals("UNO"))
                        {
                            this.command.pass(true);
                        }
                        
			else if(fields.length == 3 && fields[2].equals("UNO"))
                        {
                            this.command.pass(true);
                        }
			
                        else
                        {
                            this.command.pass(false);
                        }
		}
		break;
														
		case 2:
                    this.command.pass(false);
                    this.State = 0;
                    break;
							
		case 3:
                    System.out.println("SORRY, BUT YOU CAN ONLY DO THAT ONCE A TURN.");
                    break;
							
		default:
                    System.out.println("I COULDN'T UNDERSTANT YOU LETS TRY AGAIN.");
                    break;
            }
            break;
	}  
        return false;
    }     
}
