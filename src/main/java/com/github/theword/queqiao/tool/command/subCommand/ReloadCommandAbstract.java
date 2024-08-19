package com.github.theword.queqiao.tool.command.subCommand;

import com.github.theword.queqiao.tool.command.SubCommand;
import com.github.theword.queqiao.tool.constant.BaseConstant;

public abstract class ReloadCommandAbstract implements SubCommand {

    /**
     * 获取命令名称
     *
     * @return reload
     */
    @Override
    public String getName() {
        return "reload";
    }

    /**
     * 获取命令描述
     *
     * @return 重载配置文件并重新连接所有 Websocket Client
     */
    @Override
    public String getDescription() {
        return "重载配置文件并重新连接所有 Websocket Client";
    }

    /**
     * 获取命令用法
     *
     * @return 使用：/{@link BaseConstant#COMMAND_HEADER} reload
     */
    @Override
    public String getUsage() {
        return "使用：/" + BaseConstant.COMMAND_HEADER + " reload";
    }
}
