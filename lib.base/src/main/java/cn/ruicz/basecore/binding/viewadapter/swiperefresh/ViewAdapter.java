package cn.ruicz.basecore.binding.viewadapter.swiperefresh;

import android.databinding.BindingAdapter;
import android.support.v4.widget.SwipeRefreshLayout;

import cn.ruicz.basecore.binding.command.BindingCommand;


/**
 * Created by goldze on 2017/6/18.
 */
public class ViewAdapter {
    @BindingAdapter({"onRefreshCommand"})
    public static void onRefreshCommand(SwipeRefreshLayout swipeRefreshLayout, final BindingCommand onRefreshCommand) {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (onRefreshCommand != null) {
                    onRefreshCommand.execute();
                }
            }
        });
    }

}
