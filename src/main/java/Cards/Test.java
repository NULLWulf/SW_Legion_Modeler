
package Cards;

import java.util.List;
import javax.annotation.Generated;

import Cards.Units.Unit;
import Cards.Upgrades.Upgrade;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
public class Test {

    @SerializedName("commandCards")
    private List<CommandCard> mCommandCards;
    @SerializedName("units")
    private List<Unit> mUnits;
    @SerializedName("upgrades")
    private List<Upgrade> mUpgrades;
    @SerializedName("version")
    private Long mVersion;

    public List<CommandCard> getCommandCards() {
        return mCommandCards;
    }

    public void setCommandCards(List<CommandCard> commandCards) {
        mCommandCards = commandCards;
    }

    public List<Unit> getUnits() {
        return mUnits;
    }

    public void setUnits(List<Unit> units) {
        mUnits = units;
    }

    public List<Upgrade> getUpgrades() {
        return mUpgrades;
    }

    public void setUpgrades(List<Upgrade> upgrades) {
        mUpgrades = upgrades;
    }

    public Long getVersion() {
        return mVersion;
    }

    public void setVersion(Long version) {
        mVersion = version;
    }

}
