package com.example.time.controller;

import com.example.time.dao.model.User;

import java.util.*;
import java.util.stream.Collectors;


public class Test {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("1", "张三", "一年级", 95));
        list.add(new User("2", "李四", "二年级", 96));
        list.add(new User("3", "王五", "三年级", 98));
        list.add(new User("4", "朱六", "三年级", 100));



//        list.stream().map(score -> score.getClassName()+1).forEach(System.out::println);

//        /**遍历*/姚显长叹一声，他也知道，事到如今，再责备姚书也是无济于事，吕瑶的灵堂设在偏殿，且姚家不大操大办，这已经说明了一个态度，如今就等着吕家找上门来，他到是想问问那吕松，这么一个残花败柳，他们吕家是有多大的胆子，敢往姚家来送？真当姚家一个个都是病猫么？
//
//姚显生气了，凤羽珩太了解自己的爷爷，不由得暗笑起来。很好，吕家，且让你们看看我爷爷发怒的后果，看看你们吕家到底承不承受得起。
//
//姚家虽大丧，可以人们看来，却一点都没有大丧的样子，除去一间灵堂之外，这合府上下不见一丝丧气，就连姚书都是精气神足着，连带着姚府的下人也完全不把那个死去的少夫人当回事，该干什么还干什么。更何况，今日月夕，别说姚家本就没打算开放府门迎客进府吊唁，就算是有人要来，那也得明日才对，哪有八月十五月圆之夜往灵堂跑的？就连吕家都一直也没有人上门呢！
//
//说到吕家，此时，吕燕正站在书房里，跟吕松与葛氏说着今日之事。毕竟葛氏没有进宫，吕家只送进去了两个女儿，吕松又忙着跟一众官员打交道，哪里有精神头注意到女眷这边的事。而如今，听吕燕添油加醋再有意曲解的一番说词，他更是认定了那吕瑶是妒忌吕萍进宫，害怕吕家从今往后的注意力不放在她那边，这才动手这样子害吕萍。
//
//葛氏气得直哆嗦，不由得大骂吕瑶：“太不懂事了！这是要陷我们吕家于何种地步啊？老爷，吕瑶从小就嫉妒心极强，少时，她妒忌燕儿也成为了嫡女，没少挤兑，我都看在前任夫人命苦的份儿上把事情给压了下来，不只一次地告诉我们燕儿要忍让，不能去招惹她姐姐。可是却没想到，她的妒忌心不只是在燕儿身上，竟然连一个庶女都不放过。”
//
//吕燕也跟着帮腔——“就是！爹爹，亏得您还那样栽培她，可是您想想，从小到大，她都做了些什么啊？不说别的，就是跟大哥的那一档子事，当日嫁入姚家时还不够让咱们胆颤心惊吗？宫里的嬷嬷不知道收了她什么好处竟然给瞒了下来，可这事儿当初若是没瞒住，姚家追究起来……父亲，您不只一次的说过姚家不能得罪，可是如今呢？得罪了一次不说，吕瑶她为了害大姐姐，居然把人家姚家的大夫人也给拖下了水，这可怎么办才好呀！”
//
//母女二人眼色一对，一唱一和，说得吕松也是连连叹气。只道自己的夫人和女儿说得没错，吕瑶就是个祸害精，从小到大没给府上做过一件长脸之事，这嫁到姚家才几日光景，居然就……他狠狠地跺脚：“当初这步棋，走的就是错的！也怪我糊涂，怎的就能把那个小畜生给送到姚府去？送谁也比送她强！”
//
//吕燕一哆嗦，生怕折了一个吕瑶父亲再把主意打到她的身上，于是赶紧给葛氏使眼色，就听葛氏道：“姚家现在已经不能再惦记了，以那姚显的脾气，这次不跟吕家闹个鱼死网破已经算是仁慈，怎么可能再让一个吕家的女儿进门。到是……可惜了萍儿。”
//
//吕松也叹，“的确是可惜了，我原本看好了任家的嫡子，却没想到出了这档子事。”
//
//葛氏趁热打铁，一把抓住吕燕的手说：“燕儿，你可听母亲的话，最近几日能不出门就不要出门，以后也尽量少些抛头露面。如今吕家可就剩下你一根独苗，你要是再有个闪失，你让父亲母亲还能有什么指望啊！”
//
//吕松也跟着点头，认了葛氏的说法。
//
//吕燕眼睛一亮，她等的就是这个结局。吕瑶吕萍两败俱伤，现在的吕家，可就全靠她了！
//
//这一晚，吕家注定无法安生，姚家虽说看似无忧，却也不可能完全不往吕瑶这事上想。可凤羽珩到真是没什么事了，从姚府出来之后就准备回郡主府里吃月饼，可才一出门，一眼就看到玄天冥的宫车正等在外头。白泽坐在车厢前，手里扬着马鞭冲着她高喊着：“王妃！你可出来了，主子等了你老半天。”
//
//说话间，身后车厢帘子一挑，里头，玄天冥一身紫袍冲着她招手：“快上来，本王带你去看月夕的花灯！”
//
//凤羽珩也是开心，提着裙摆跑上前，却没上车，只道：“我先回去换身衣裳啊！”
//
//玄天冥却是急得不行，“换什么换啊？本王的媳妇穿什么都好看。白泽，把你们王妃请上来！”
//
//白泽贼兮兮地一笑，跳下宫车冲着凤羽珩做了个请的手势：“王妃，快上车吧！”
//
//凤羽珩摇摇头，却也没再坚持，扶着白泽的胳膊跳上宫车，然后乐呵呵地坐到玄天冥身边，就听外头一声：“驾！”宫车缓缓前行。
//
//可今日宫车里并不只玄天冥一人，凤羽珩进来之后才发现，玄天华竟然也在，两人正一边一个地对坐着，一个手摇折扇，一个磕着瓜子。
//
//她从玄天冥手里把几粒剥好的瓜子占为己有，一边往嘴里送一边问玄天华：“七哥，今日跟那罗天知府骗了多少银子？”刚说完，脑袋上就被人敲了一下，她瞪身边这个不要脸的：“玄天冥你打我头干什么？”
//
//玄天冥纠正她：“什么叫骗？那是明码实价。”
//
//玄天华也跟着点头：“没错，东海珍珠的确是有价可寻的。”
//
//“那到底跟他要了多少？”凤羽珩一脸期待。
//
//可玄天华显然并不想让她知道确切之数，只道：“不会让你失望便是。”
//
//凤羽珩撇撇嘴，不再继续这个话题，到是打趣起玄天华来：“七哥，你这是打算跟我们一起去看花灯？”
//
//玄天华点头，“九弟相邀，左右无事，便与你们一起转转。”
//
//“这恐怕……不太好吧？”小丫头往前探了身子，给玄天华摆事实讲道理，“你看，我跟玄天冥那肯定是一对儿了，但七哥你这形单影只的，怎么看怎么不协调啊！你是不是也找个伴儿？”
//
//玄天华摇头，“白泽黄泉也没有伴儿。”
//
//“谁说他俩没有？”凤羽珩指着车外头两个赶车的一男一女说，“他们既是随从，自然是要走在一起的，所以勉强也算能凑个伴儿。可是七哥你，总不能跟他们走在一处吧？”
//
//玄天华苦笑，再想想，道：“咱们可以往文宣王府去一趟，把天歌叫上，我带着天歌就好。”
//
//凤羽珩连连摆手，“不好不好。文宣王与王妃都在府里，人家一家过个月夕多好，吃个团圆饭，那是我们盼都盼不来的，七哥你可不能破坏人家天伦之乐。”
//
//玄天华也没了办法：“那你说该如何？”
//
//小丫头眼珠一转：“要不……给你找个伴儿吧！”
//        list.forEach((o)->System.out.println("userId:"+o.getUserId()+", userName:"+o.getUserName()));
//
//        /**遍历*/
//        list.forEach(o->{
//            System.out.println("userId:"+o.getUserId()+", userName:"+o.getUserName());
//        });
//
//        /**转hashSet*/
//        Set<User> set1 = list.stream().collect(Collectors.toSet());
//
//        /**转hashSet*/
//        Set<String> set2 = list.stream().map(User::getUserName).collect(Collectors.toSet());
//
//        /**转treeSet*/
//        TreeSet<String> set3 = list.stream().map(User::getUserName).collect(Collectors.toCollection(TreeSet::new));
//
//        /**转map*/
//        Map<String, String> map1 = list.stream().collect(Collectors.toMap(User::getUserId, User::getUserName));
//
//        /**转map*/
//        Map<String, String> map2 = list.stream().collect(Collectors.toMap(User::getUserId, User::getUserName, (k1, k2)->k1));
//
//        /**分组*/
//        Map<String, List<User>> map3 = list.stream().collect(Collectors.groupingBy(User::getClassName));
//        map3.entrySet().stream().forEach(x->{
//            System.out.println(x.getKey());
//            x.getValue().stream().map(c->c.getScore()).forEach(System.out::println);
//        });
        List<User> list1 = list.stream().filter(o->o.getScore()>97).filter(o->o.getClassName().equals("二年级")).collect(Collectors.toList());
        list1.stream().map(a->a.getUserName()).forEach(System.out::println);
//
//        /**分组count*/
//        Map<String, Long> map4 = list.stream().collect(Collectors.groupingBy(User::getClassName, Collectors.counting()));
//
//        /**分组求和*/
//        Map<String, Integer> map5 = list.stream().collect(Collectors.groupingBy(User::getClassName, Collectors.summingInt(User::getScore)));
//
//        /**过滤条件*/
//        List<User> temp1 = list.stream().filter(o->"1".equals(o.getUserId())).collect(Collectors.toList());
//
//        /**多个过滤条件*/
//        Predicate<User> scoFilter = (o) -> (o.getScore() > 25);
//        Predicate<User> clsFilter = (o) -> ("三年级".equals(o.getClassName()));
//        List<User> temp2 = list.stream().filter(scoFilter).filter(clsFilter).collect(Collectors.toList());
//
//        /**取前多少个*/
//        List<User> temp3 = list.stream().limit(2).collect(Collectors.toList());
//
//        /**升序排序*/
//        List<User> temp4 = list.stream().sorted((u1, u2)->(u1.getScore()-u2.getScore())).collect(Collectors.toList());
//
//        /**降序排序*/
//        List<User> temp5 = list.stream().sorted((u1, u2)->(u2.getScore()-u1.getScore())).collect(Collectors.toList());
//
//        /**升序排序*/
//        User user1 = list.stream().max((u1, u2)->(u1.getScore()-u2.getScore())).get();
//
//        /**降序排序*/
//        User user2 = list.stream().min((u1, u2)->(u1.getScore()-u2.getScore())).get();
//
//        /**求和*/
//        int sum = list.parallelStream().mapToInt(p -> p.getScore()).sum();
//
//        /**汇总数据*/
//        IntSummaryStatistics stats = list.stream().mapToInt((x) -> x.getScore()).summaryStatistics();
//
//        System.out.println("最大的数字 : " + stats.getMax());
//        System.out.println("最小的数字 : " + stats.getMin());
//        System.out.println("所有数字的总和 : " + stats.getSum());
//        System.out.println("所有数字的平均值: " + stats.getAverage());
//
    }
//
//    public static Set<Integer> getIntKeys(int sta, int size){
//        return Stream.iterate(sta, item -> item+1).limit(size).collect(Collectors.toSet());
//    }

    /*
     *@author jiafeng
     *@date 2019/9/3 0003 11:22
     */
    public static class Theard {
    }
}