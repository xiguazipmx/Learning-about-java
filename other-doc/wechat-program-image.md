---
title: wechat拆分小结
tags: wechat
notebook: wechat
---

# 微信小程序常用知识归类 - 图片

#### 预览
![png](
https://common-png.oss-cn-beijing.aliyuncs.com/blog/add-image.jpg)

[微信小程序官网](https://developers.weixin.qq.com/miniprogram/dev/api/wx.chooseImage.html)
### 上传图片
```
wx.chooseImage({
  count: 1,//一次可以选择上传图片数量。max=9
  sizeType: ['original', 'compressed'],
  sourceType: ['album', 'camera'],
  success(res) {
    // tempFilePath可以作为img标签的src属性显示图片
    const tempFilePaths = res.tempFilePaths
    wx.uploadFile({
      url: '上传地址', 
      filePath: tempFilePaths[0],
      name: 'file',
      formData: {
        user: 'test'
      },
      success(res) {
        const data = res.data
        // do something
      }
    })
    //上传图片加入image_list
    //上传图片url加入image_list_urls
    image_list.push(data);
    image_list_url.push(tempFilePaths)
  }
})
```
###图片预览
```
wx.previewImage(
    current: 'image_list_url[i]', // 当前显示图片的http链接
    urls: [image_list_url] // 需览的图片http链接列表
)
```
###页面代码
```
<view wx:for="{{image_list}}" wx:for-index="idx" >
  <image src='{{item.img_src}}' data-src='{{item.img_src}}' bindtap='preViewImage'></image>
</view>
```
###图片删除
```
//要删除image_list和image_list_url中的数据
image_list.splice(_idx,1);
image_list_url.splice(_idx,1);
```