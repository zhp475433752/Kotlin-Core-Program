
    Kotlin核心编程

运行测试方式：
    1.右键 KotlinTest -> Run 'KotlinTest.main()'
        如果出现错误：SourceSet with name 'main' not found.
        解决方案：需要在.idea的gradle.xml中添加<option name="delegatedBuild" value="false" />
    2.单元测试 test 模块中直接运行