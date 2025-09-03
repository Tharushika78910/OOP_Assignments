package Task_1;

public class Television {
    private boolean on;     //Whether the TV is turned on.
    private int curr_channel;       //current channel

    private static int MAX_CHANNEL = 10;

    public Television() {
        this.on = false;
        this.curr_channel = 1;
    }

    //Returns whether the TV is on
    public boolean isOn() {
        return on;
    }

    //Toggles the TV state
    public void pressOnOff() {
        on = !on;
    }

    //Returns the current channel
    public int getChannel() {
        return curr_channel;
    }

    //Sets the TV channel
    public void setChannel(int channel) {
        if (on)
        {
            if(channel > MAX_CHANNEL)
            {
                this.curr_channel = 1;
            } else if (channel<1)
            {
                this.curr_channel = MAX_CHANNEL;
            }else
            {
                this.curr_channel = channel;
            }
        }
    }

}
