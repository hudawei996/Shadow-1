package com.tencent.shadow.runtime;

import android.os.Bundle;

public class ShadowDialogFragment extends ShadowFragment {

    private ContainerDialogFragment getContainerDialogFragment() {
        return (ContainerDialogFragment) mContainerFragment;
    }

    public void setStyle(int style, int theme) {
        if (mIsAppCreateFragment) {
            getContainerDialogFragment().setStyle(style, theme);
        }
    }

    public void setCancelable(boolean cancelable) {
        if (mIsAppCreateFragment) {
            getContainerDialogFragment().setCancelable(cancelable);
        }
    }

    public ShadowDialog getDialog() {
        return (ShadowDialog) getContainerDialogFragment().getDialog();
    }

    public int getTheme() {
        return getContainerDialogFragment().getTheme();
    }

    public void dismiss() {
        getContainerDialogFragment().dismiss();
    }

    public void dismissAllowingStateLoss() {
        getContainerDialogFragment().dismissAllowingStateLoss();
    }

    public void show(PluginFragmentManager manager, String tag) {
        getContainerDialogFragment().show(manager.mBase, tag);
    }

    public ShadowDialog onCreateDialog(Bundle savedInstanceState) {
        return new ShadowDialog(getActivity(), getTheme());
    }
}