package net.mcmmorpg.admin.yuyanyanplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * yuyanyanPlugin メインクラス
 * @author kojima1021
 */
public class Main extends JavaPlugin implements Listener{
    //インスタンス
    private static Main instance;
    /**
     * メインクラスを取得します
     * @return instance
     */
    public static Main getInstance(){
        return instance;
    }
    //Plugin開始時
    @Override
    public void onEnable() {
        //初期設定完了
        getLogger().info("Ver.1.0.0");
    }
    //Pluginun終了時
    @Override
    public void onDisable() {
        getLogger().info("プラグインを正常に終了しました。");
    }
}