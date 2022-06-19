
package Cards.Units;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Dice {

    @SerializedName("black")
    private Long mBlack;
    @SerializedName("red")
    private Long mRed;
    @SerializedName("white")
    private Long mWhite;

    public Long getBlack() {
        return mBlack;
    }

    public void setBlack(Long black) {
        mBlack = black;
    }

    public Long getRed() {
        return mRed;
    }

    public void setRed(Long red) {
        mRed = red;
    }

    public Long getWhite() {
        return mWhite;
    }

    public void setWhite(Long white) {
        mWhite = white;
    }

}
