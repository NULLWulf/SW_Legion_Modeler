
package Cards.Units;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Weapon {

    @SerializedName("area_of_effect")
    private Long mAreaOfEffect;
    @SerializedName("Dice")
    private Dice mDice;
    @SerializedName("keywords")
    private Keywords mKeywords;
    @SerializedName("max_range")
    private Long mMaxRange;
    @SerializedName("min_range")
    private Long mMinRange;
    @SerializedName("name")
    private String mName;

    public Long getAreaOfEffect() {
        return mAreaOfEffect;
    }

    public void setAreaOfEffect(Long areaOfEffect) {
        mAreaOfEffect = areaOfEffect;
    }

    public Dice getDice() {
        return mDice;
    }

    public void setDice(Dice dice) {
        mDice = dice;
    }

    public Keywords getKeywords() {
        return mKeywords;
    }

    public void setKeywords(Keywords keywords) {
        mKeywords = keywords;
    }

    public Long getMaxRange() {
        return mMaxRange;
    }

    public void setMaxRange(Long maxRange) {
        mMaxRange = maxRange;
    }

    public Long getMinRange() {
        return mMinRange;
    }

    public void setMinRange(Long minRange) {
        mMinRange = minRange;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
