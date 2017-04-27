//
//  BuglyLogMacro.swift
//  BuglySDKDemo
//
//  Created by Yeelik on 15/11/4.
//  Copyright © 2015年 Tencent. All rights reserved.
//
//
//  This file only to convert the BuglyLog to swift function
//

import Foundation
import Bugly

public func BLogError(_ format: String, _ args: CVarArg...){
    BLYLogv(BuglyLogLevel.error, format, getVaList(args))
    
}

public func BLogWarn(_ format: String, _ args: CVarArg...){
     BLYLogv(BuglyLogLevel.warn, format, getVaList(args))
}

public func BLogInfo(_ format: String, _ args: CVarArg...){
     BLYLogv(BuglyLogLevel.info, format, getVaList(args))
}

public func BLogDebug(_ format: String, _ args: CVarArg...){
     BLYLogv(BuglyLogLevel.debug, format, getVaList(args))
}
