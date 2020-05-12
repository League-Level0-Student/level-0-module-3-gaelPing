
void setup() {
  size(500, 500);
  // set the size of your sketch
}

void draw() {

  for (int i=10; i>0; i--) {
    if(i % 2 == 0 )
  {
  fill(#082883);
  }
  if(i % 2 == 1)
{
fill(#05FCF6);
}
    ellipse(250, 250, i*40,i*40 );
    

    
  
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
   
  
  //Use an if statement and modulo to alternate the color of your rings.
}
