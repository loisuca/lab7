package pb1;

    public abstract class vehicle {
        private int speed;
        public vehicle(){
            this.speed=0;
        }
        public abstract void speedup();
        protected void printspeedincrease(String vehicletype, int increaseamount){
            System.out.println(vehicletype+"the speed increased by "+increaseamount+" units");
        }
        public int getSpeed(){
            return speed;
        }
    }
