public class SnakeGame{
  	public static void main(String[] args) {
  		Snake snake = new Snake();  
  		Rabbit rabbit = new Rabbit();
      
      snake.s = 10;
      rabbit.r = 0;
      
      while(rabbit.r != snake.s){
         for(snake.s = 10, rabbit.r = 0; (snake.s >= rabbit.r) && (rabbit.r <= snake.s); snake.s--, rabbit.r++){
         snake.talkPositionS();
         rabbit.talkPositionR();
         
         if(snake.s==rabbit.r)
         {
         snake.talkDead();
         rabbit.talkDead();
         break;
         }
         if(snake.s-rabbit.r==2)
         {
         rabbit.talkAlmostDead();
         }
      }        
      }
          
       	 
   }
}
