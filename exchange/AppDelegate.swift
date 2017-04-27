//
//  AppDelegate.swift
//  exchange
//
//  Created by xiaomo on 2017/04/21.
//  Copyright © 2017年 xiaomo. All rights reserved.
//

import UIKit
import Bugly

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?


    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplicationLaunchOptionsKey: Any]?) -> Bool {
        // Override point for customization after application launch.
        NSLog("Init Bugly");
        
        let config = BuglyConfig()
        
        config.debugMode = true
        
        config.viewControllerTrackingEnable = true
        
        config.reportLogLevel = BuglyLogLevel.warn
        Bugly.start(withAppId: "796e068b57" , config: config)
        return true
    }

    func applicationWillResignActive(_ application: UIApplication) {
        // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
        // Use this method to pause ongoing tasks, disable timers, and invalidate graphics rendering callbacks. Games should use this method to pause the game.
    }

    func applicationDidEnterBackground(_ application: UIApplication) {
        // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
        // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
    }

    func applicationWillEnterForeground(_ application: UIApplication) {
        // Called as part of the transition from the background to the active state; here you can undo many of the changes made on entering the background.
    }

    func applicationDidBecomeActive(_ application: UIApplication) {
        // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
    }

    func applicationWillTerminate(_ application: UIApplication) {
        // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
    }

    func logInBackground(){
        
        while(1 > 0) {
            BLogError("Test %@", "Error")
            
            BLogWarn("Test %@", "WARN")
            
            sleep(1)
            
            BLogWarn("Test %@", "INFO")
        }
    }
}

