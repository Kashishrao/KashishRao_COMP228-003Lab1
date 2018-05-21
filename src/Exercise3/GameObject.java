package Exercise3;

import javax.swing.JOptionPane;

    public class GameObject {
        // instance variables
        int center;
        private String 	 velocity,
                state ,
                rotation ;
        //Constructor
        public GameObject(int center, String velocity, String state, String rotation) {
            this.center = center;
            this.velocity = velocity;
            this.state = state;
            this.rotation = rotation;
        }

        // Getter and Setter
        public int getCenter() {
            return center;
        }

        public void setCenter(int center) {
            this.center = center;
        }

        public String getVelocity() {
            return velocity;
        }

        public void setVelocity(String velocity) {
            this.velocity = velocity;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getRotation() {
            return rotation;
        }

        public void setRotation(String rotation) {
            this.rotation = rotation;
        }

        //Method to return GameObject's Information
        public String getGameObjectInformation (){
            return "GameObject center: " + center + "\n" +
                    "velocity: " + velocity + "\n" +
                    "state: " + state + "\n" +
                    "rotation: " + rotation + "\n";

        }

    }


    class GameObjectTest {
        public static void main(String[] args) {

            // TODO Auto-generated method stub

            int x= Integer.parseInt(JOptionPane.showInputDialog("Enter x coordinate of Game Object:"));
            int y= Integer.parseInt(JOptionPane.showInputDialog("Enter y coordinate of Game Object:"));
            int center=(x+y)/2;
            String velocity = JOptionPane.showInputDialog("Enter velocity of Game Object:");
            String state = JOptionPane.showInputDialog("Enter state of Game Object:alive or dead");
            String rotation = JOptionPane.showInputDialog("Enter rotation of Game Object::");


            GameObject gameObject = new GameObject( center, velocity, state, rotation);

            String message = gameObject.getGameObjectInformation();

            JOptionPane.showMessageDialog(null, message );

        }
    }



