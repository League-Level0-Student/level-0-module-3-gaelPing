int x=400;
int y=400;
void setup() {
  size(500, 500);
  // set the size of your sketch
}

void draw() {

  for (int i=0; i<40; i++) {
    noStroke();
    ellipse(250, 250, x, y);
    x-=10;
    y-=10;
  if(x==400){
    fill(#000000);
  }
      if (x==350) {
      fill(#FC0000);
    }
    if (x==300) {
      fill(#000000);
    }
        if (x==250) {
      fill(#FC0000);
    }
     if (x==200) {
      fill(#000000);
    }
     if (x==150) {
      fill(#FC0000);
    }
     if (x==100) {
      fill(#000000);
    }
     if (x==50) {
      fill(#FC0000);
    }
     if (x==0) {
      fill(#000000);
    }
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
   
    x = 400;
   y = 400;
  //Use an if statement and modulo to alternate the color of your rings.
}
