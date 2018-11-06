package top.onehundred.android.kits.kits;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import top.onehundred.android.kits.ok;

public class AppKit {

    public static AppKit getInstance(){
        return new AppKit();
    }

    private PackageInfo getPackageInfo() throws PackageManager.NameNotFoundException {
        return ok.app().getPackageManager().getPackageInfo(ok.app().getPackageName(), 0);
    }

    /**
     * 获取应用程序名称
     */
    public String getAppName() {
        try {
            int labelRes = getPackageInfo().applicationInfo.labelRes;
            return ok.app().getResources().getString(labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取应用程序版本名称信息
     *
     * @return 当前应用的版本名称
     */
    public String getVersionName() {
        try {
            return getPackageInfo().versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取应用版本码
     *
     * @return 版本码，出现异常回传0
     */
    public int getVersionCode() {
        try {
            return getPackageInfo().versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 获取应用包名
     *
     * @return 包名，出现异常回传null
     */
    public String getPackageName() {
        try {
            return getPackageInfo().packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
