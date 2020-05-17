import java.util.*;

/**
 * @author admin
 * @create 2020-05-17 17:22
 * @desc 集合用法演示
 **/
class KeCheng {
    public String id;
    public String name;
    public KeCheng(String id,String name){
        this.id = id;
        this.name = name;
    }
}

 class Student {
    public String id;
    public String name;
    public Set kecheng;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
        this.kecheng = new HashSet();
    }
}
public class CollectionDemo {

        //用于存放备选课程的List
        public List beixuan;
        public CollectionDemo (){
            this.beixuan = new ArrayList();
        }


    /*
       * 用来往beixuan里添加备选课程的方法
       */
    public void kcAdd(){
        //创建一个课程的对象，调用add方法，添加到备选课程的List中
        KeCheng kc = new KeCheng("1","数据结构");
        beixuan.add(kc);
        KeCheng kc2 = new KeCheng("2","C语言");
        beixuan.add(0, kc2);
        KeCheng[] kcArr = {new KeCheng("3","大学语文"),new KeCheng("4","线性代数")};
        beixuan.addAll(Arrays.asList(kcArr));
        KeCheng[] kcArr2 = {new KeCheng("5","艺术设计"),new KeCheng("6","计算机基础")};
        beixuan.addAll(2, Arrays.asList(kcArr2));
    }

    /*
       * 使用for循环遍历课程的方法
       */
    public void getKC(){
        int size = beixuan.size();
        System.out.println("使用for遍历课程：");
        for (int i = 0; i < size; i++) {
            KeCheng kc = (KeCheng) beixuan.get(i);
            System.out.println("课程："+kc.id+":"+kc.name+";");
        }
    }

    /*
       * 使用Iterator迭代器遍历课程
       */
    public void testIterator(){
        Iterator it = beixuan.iterator();
        System.out.println("使用Iterator遍历课程：");
        while(it.hasNext()){
            KeCheng kc = (KeCheng) it.next();
            System.out.println("课程："+kc.id+":"+kc.name+";");
        }
    }
    /*
     * 使用for each遍历课程
     */
    public void testForeach(){
        System.out.println("使用for each遍历课程：");
        for(Object obj : beixuan){
            KeCheng kc = (KeCheng)obj;
            System.out.println("课程："+kc.id+":"+kc.name+";");
        }
    }


    /*
      * 使用set方法添加课程
      */
    public void testModify(){
        beixuan.set(0, new KeCheng("7","毛概"));
    }


    /*
       * 使用remove方法删除课程
       */
    public void testRemove(){
        KeCheng kc = (KeCheng) beixuan.get(0);
        System.out.println("我是课程："+kc.id+":"+kc.name+";即将被删除");
        boolean b = beixuan.remove(kc);
        if(b){
            System.out.println("成功删除课程");
            testForeach();
        }
    }


    /*
       * 使用removeAll方法删除课程
       */
    public void testRemoveAll(){
        System.out.println("即将删除4和5位置上的课程");
        KeCheng[] kc = {(KeCheng) beixuan.get(4),(KeCheng) beixuan.get(5)};
        beixuan.removeAll(Arrays.asList(kc));
        System.out.println("课程删除成功");
        testForeach();
    }
}
