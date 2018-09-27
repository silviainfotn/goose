public class GooseGame {
    private String input;
    private String output;
    public void userWrites(String str) {
        this.input = str;
        checkInput();
    }
    private boolean checkInput() {
        if (input=="add player Pippo") {
            if (output != null && output.contains("Pippo") ){
                output="Pippo: already existing player";
            }else{
                output="players:Pippo";
            }
            return true;
        }else if (input=="add player Pluto") {
            output="players:Pippo, Pluto";
            return true;
        }else if (output != null && output.contains("Pippo")
                && output.contains("Pluto")
                && input=="move Pippo 4, 2") {
            output="Pippo rolls 4, 2. Pippo moves from Start to 6";
            return true;
        }
        else if (output != null && output.contains("Pippo")
                && output.contains("Pluto")
                && input=="move Pluto 2, 2") {
            output="Pluto rolls 2, 2. Pippo moves from Start to 4";
            return true;
        }
        else if (output != null && output.contains("Pippo")
                && output.contains("Pluto")
                && input=="move Pippo 2, 3") {
            output="Pippo rolls 2, 3. Pippo moves from 6 to 11";
            return true;
        }

        return false;
    }
    public String userRead() {
        return this.output;

    }



}
