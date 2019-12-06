package com.example.time.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/* 将时间段 按自然周 自然月分割时间区间
 * @Description
 * @author jiafeng
 * @date 2019/10/17 0017
 */
public class TimeDateUtils {

    public static final String YYYYMMDD = "yyyy-MM-dd";
    public static final String YYYYMMDD_ZH = "yyyyMMdd";
    public static final int FIRST_DAY_OF_WEEK = Calendar.MONDAY;
    public static final String YYYYMM = "yyyy-MM";



//月
    public static String getMonths(String begins, String ends) throws ParseException {
        StringBuilder time = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date begin = new Date();
        Date end = new Date();

        begin = sdf.parse(begins);
        end = sdf.parse(ends);

        Calendar cal_begin = Calendar.getInstance();
        cal_begin.setTime(begin);
        Calendar cal_end = Calendar.getInstance();
        cal_end.setTime(end);
        while (true) {
            if (cal_begin.get(Calendar.YEAR) == cal_end.get(Calendar.YEAR)&& cal_begin.get(Calendar.MONTH) == cal_end.get(Calendar.MONTH)) {
                time.append(sdf.format(cal_begin.getTime())+"~"+sdf.format(cal_end.getTime())+"~");
                break;
            }
            String str_begin = sdf.format(cal_begin.getTime());
            String str_end = getMonthEnd(cal_begin.getTime());
            time.append(str_begin+"~"+str_end+"~");
            cal_begin.add(Calendar.MONTH, 1);
            cal_begin.set(Calendar.DAY_OF_MONTH, 1);
        }
        return time.toString();
    }
    //周
    public static String getWeeks(String begins, String ends) throws ParseException {
        StringBuilder time1 = new StringBuilder();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdw = new SimpleDateFormat("E");
        String begin_date =begins;
        String end_date =ends;
        String begin_date_fm =  begins;
        String end_date_fm = ends;
        Date b = null;
        Date e = null;
        try {
            b = sd.parse(begin_date_fm);
            e = sd.parse(end_date_fm);
        } catch (ParseException ee) {
            ee.printStackTrace();
        }
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(b);
        Date time = b;
        String year = begin_date_fm.substring(0,4);
        String mon = begin_date_fm.substring(4,6);
        String day = begin_date_fm.substring(6,8);
        String timeb = year+mon+day;
        String timee = null;
        if(begin_date==end_date){
            time1.append(begin_date+"~"+end_date+"~");
        }else{
            while(time.getTime()<=e.getTime()){
                rightNow.add(Calendar.DAY_OF_YEAR,1);
                time = sd.parse(sd.format(rightNow.getTime()));
                if(time.getTime()>e.getTime()){break;}
                String timew = sdw.format(time);
                if(("星期一").equals(timew)){
                    timeb = (sd.format(time));
                }
                if(("星期日").equals(timew) || ("星期七").equals(timew) || time.getTime() == e.getTime()){
                    timee = (sd.format(time));
                    time1.append(timeb+"~"+timee+"~");
                }
            }
        }
        return time1.toString();
    }


/*
*
*
*
    战场之外，那翻滚不休的岩浆之中，有着四道身影先后下潜而来，正是黑水河的戴柳和圣妖殿的冰火二祖，还有那被称作“无主断剑”的凌厉男子。UU小说 www.uu234.com更新最快

    他们在杜少甫之后，想要下来一探天炎洞虚雷的状况。

    在天炎洞虚雷与杜少甫二人初步交手之时，他们就已经有所觉察！

    但就在快要接近那二人之处时，猛然便是受到了一阵巨力的袭击！

    那汹涌澎湃的能量波动，似是怒海狂滔一般，四人在其中如同狂潮中的几只游虫，直接被掀至九霄云上，不能自已！

    四人惊骇非常，各自体内的妖能急速运转，想要控制住自己的身体。

    但在这股能量余波之中，也只能堪堪护住自身不受创伤，想要挣脱眼下的境况，却是无以做到！

    战场中心的位置，那道巨大的空间裂缝久久不曾愈合，就那么张开着，好似一张魔王的巨口，森然慑人！

    当一切的破碎能量湮灭一尽，有着火红色的液体自空间深渊的缺口中灌溉而进，携带着炽热的高温，顷刻之间就将处于真空的地带充斥填满，形成一片岩浆海洋，一个火红色的世界。

    这，是熔岩世界中的岩浆，通过空间裂缝，进到了这里！

    岩浆滚滚，沸腾不止，泛着一个个泡泡，炸开之后便是一团火焰燃烧起来！

    在这岩浆海洋之中，有两道身影各自而动。

    天炎洞虚雷的本体，以一团黑幽幽的状态存在着。

    而杜少甫，则身外包裹着青灵铠甲，有凌厉的光芒泛起。

    一丝紫金色的鲜血，自他的嘴角淌下，在炽热的岩浆之中飘浮，顷刻间被烧成了飞灰。

    一招对击之下，天炎洞虚雷没有受到任何伤害，而杜少甫，却是有着不轻的伤势！

    他身外的雷霆武脉，被一冲而破，直接消散在了滚滚岩浆之中。

    那七道灵雷，也是冲散，但很快又是飞掠回来，被杜少甫收进了体内。

    “人类，你凭什么战胜我！”

    天炎洞虚雷狂声而语，说话之时，在熔岩海洋之中急速而动！

    那奇异的法则波动再一次展开，正快速地酝酿提升着。

    熔岩海洋之中，有着可怕的威压降临，直接是压制在了杜少甫的肉身与元神之上。

    他只感觉到，有着恐怖绝世的巨大力量镇压着每一寸血肉！

    自己所掌握的雷电奥义，受到了恐怖的限制，在天炎洞虚雷面前，根本无法尽情施展！

    “真的只能受到他的限制么？”

    被熔岩包裹着的杜少甫，目光微凝，暗暗自语道。

    他心里清楚，如果是凭借着其他的手段，今天想要战胜这天炎洞虚雷，恐怖还真是有些痴心妄想。

    实力境界上的差距，决定了他很难对天炎洞虚雷造成伤害。

    自己本是有着雷霆武脉，可以克制灵雷。

    但现在，在法则雏形之力的影响之下，雷霆武脉似乎也无法起到好的效用。

    “我还就不信这个邪！”

    杜少甫咬牙，紫金天阙从手中消失而去。

    他体内的玄气开始疯狂地运转起来，在四肢百骸奇经八脉之中肆意纵横冲撞，如同一条大河奔腾呼啸，发出震天动地的隆隆之声！

    而后，肉眼可见的，他的皮肤之上，经脉全都鼓胀而起，爬满了每一处。

    那张俊朗的脸庞之上，也布满了一根根突起的大筋，看上去极为可怖！

    “雷霆武脉，再给我开！”

    杜少甫沉声大喝，双臂猛挥而起，如是举动一座大山一般，亿万钧之力被他抬起！

    他那一双眸子之中，光芒不再，全是赤红之色！

    随着这声大喝落下，杜少甫的体表发光，无边的压力之中，肌体之上有光芒相继亮起，雷霆武脉一根根浮现出来！

    只是，此时所展现出来的武脉，居然是呈着血色！

    杜少甫紧紧咬着牙，双眼几欲瞪出眼眶！

    巨大的压力下，他的不灭玄体在迸裂，有鲜血流淌，融入岩浆海洋里，被焚烧一尽！

    在杜少甫的竭力控制之下，雷霆武脉终于离开了体表，一分一分地升起，而后扩大！

    “银罗吞魂雷，给我出！”

    杜少甫再度大喝，在他的眉心位置，银罗吞魂雷冲出，但却没有展现出太大的威势，只是一团光芒的模样，布置在了头顶的位置！

    “大地崩天雷，给我出！”

    杜少甫的声音，几乎是从喉咙里蹦出来的。

    意念控制之中，大地崩天雷亦是轻轻而动，去到了他的脚下，轻轻地旋转着。

    “金乌焚天雷，给我出！”

    “太阴天辰雷，给我出！”

    “三千震离雷，给我出！”

    “灭魂神雷，给我出！”

    一声又一声的大喝，自杜少甫口中吐出。

    到得最后，他的声音，都变得异常地嘶哑。

    巨大的压力下，他的双唇都在一下下地颤抖着。

    可以见得，天炎洞虚雷波动出的法则雏形之力，居然已经到了何种可怕的程度！

    “嘿嘿嘿嘿，可笑的人类，你这是在自寻死路么？”

    天炎洞虚雷嘿然而笑，带着全然的不屑，一点也没有把杜少甫的做法放在眼里！

    在他的法则之力克制下，对方那点在雷电奥义上的造诣，哪能入得他的法眼，只有被死死压制的份！

    天炎洞虚雷本体上的威势还在不停地增长着，一道比先前更为可怕的雷霆正在成形，波动着毁天灭地的气息！

    “我早就说过，交出你身上的七道灵雷，我还能够饶你一命，不过现在已经晚了！等我将你灭杀，会自己亲自来取！”

    “天道的家族后人，嘿嘿嘿……尽管你已经足够不凡，但在我面前，也只有送命的份！我还要谢谢你，替我找到七道灵雷，省去了我多少的麻烦！吞噬了它们，就能让我更进一步，成就天圣境界！”

    天炎洞虚雷大笑着，心中畅快不已。

    在他眼里，这个人类，非但是在做无用之功，更是在自己找死！

    他已经能够想象到，眼前的紫袍青年被自己所斩杀，那七道灵雷亦被自己掌控。

VIP卷：扶摇万里_第二千五百八十一章：你走得掉么？

    第二千五百八十一章：你走得掉么？

    天炎洞虚雷不无得意地想象着，吞噬掉这七道灵雷之后，只要再寻找到其余的灵雷，他便有着极大的希望可以融合完整的雷电法则，最终超越天圣，成就天道之身！

    没错，就如太古时期，这紫袍青年的先祖那般！

    届时，整个这一界，便都是在他的掌控之中！

    他将超越所有，至高无上，凌驾于一切众生，无人能敌！

    心中想象着，天炎洞虚雷愈发是畅快起来！

    然而，就在他无止境地幻想，大感快意之时，杜少甫的最后一道喝声便是落下！

    “你似乎有些得意忘形了！九幽魔雷，给我出！”

    随着这样一句话语从杜少甫口中喝出，自迦楼绝慏手中所得到的第七道灵雷便是横冲而出！

    九幽魔雷从他的眉心冲出之后，与其他的六道灵雷一样，分布在杜少甫的身体周围，将他团团围住。UU小说 www.uu234.com更新最快

    在这样的场景出现后，岩浆海洋之中，又是有着一股异样的威压波荡而出，与天炎洞虚雷身上波动出的，如出一辙！

    这般威势，更是将天炎洞虚雷释放出的威能，直接压盖下去！

    七道灵雷镶嵌在杜少甫身外的雷霆武脉之上，彼此之间有着神秘的联系。

    这种神秘的联系，建立在杜少甫脑海中的一副烙印之上！

    那是一团非常奇怪的纹络，看上去特别复杂，但又好似极为简单！

    一眼盯上去，能够看到无数景象幻化成形，有乾坤轮转，日月浮沉，世间万物演化；有风雨雷电，水火交融，天地伟力衍生；有生灵祭祀，虔诚祷告，浩瀚愿力汇聚……

    凡世间所有，这些景象无所不包，无所不容。

    无数的景象，激烈壮观，碰撞交织，铭刻着世间万事万物的纹理和规则。

    而要是细细观察起来，这一切都都如虚幻泡影，皆在一瞬间幻灭而去，只有那一道道简单却又晦涩的线条在发着淡淡的光芒。

    此时，这些线条之中，有着一道极为明亮，如电蛇蜿蜒盘绕着，勾连在杜少甫的雷霆武脉上，而后又连向了他身外的七道灵雷。

    这，是镌刻在杜少甫元神之上的法则烙印！

    是当初在天道之墓中，杜少甫从时间长河顺流而下时所获得的机缘，据他推测，是杜家的先祖所留下的手段。

    在那之后，杜少甫也曾尝试过去参悟这烙印，只是很可惜，以他对大千法理的见解程度，根本把握不住这些法则的轨迹，无从捕捉个中玄妙。

    所以，他一直也没有刻意去触碰这些东西，任由脑海中的法则烙印躺在那里。

    因为他相信，只要自己的感悟足够了，总有一天，他能够掌握真正的法则！

    而今时今日，在天炎洞虚雷施展法则雏形，对自己再三逼迫之下，让在他雷电奥义上的感悟有了一丝提升。

    正是这样的提升，触碰到了铭刻在元神深处的法则烙印，从而让他也是窥探到了一丝法则雏形！

    “法则，原来是这样么……”

    杜少甫口中喃喃自语，心念微动之下，银罗吞魂雷、大地崩天雷等皆是“轰咔咔”地爆鸣而开！

    在法则烙印的作用下，七道灵雷终于是绽放出了该有的气势，各自爆发出恐怖慑人的威严！

    天炎洞虚雷释放出的那一缕法则之力，再也影响不到杜少甫分毫！

    雷霆武脉与七道灵雷，也不再受到克制！

    “怎么回事！”

    这样的变故，让天炎洞虚雷心底狠狠地发颤，感觉到喉咙里有阵阵干涩之意，连话音都颤抖着。

    紫袍青年也释放出来的威势，让他感到惊惧！

    “法则之力！这居然也是法则之力！”

    很快，天炎洞虚雷大叫道。

    他心里终于是明白过来，此时的那青年，竟然也领悟到了一丝雷电的法则雏形，并且比自己所掌握的还要来得更为全面一些！

    此番之下，自己先前所占据的绝对优势，在顷刻间被瓦解，荡然无存！

    “先前，你不还是很自信么？这下该轮到我了！天雷罚世！”

    杜少甫大喝，声音传动，让周围的熔岩海洋变得更加地沸腾。

    雷电法则加持之下，散布在身外的雷霆武脉猛地扩张开去，如是一张雷电形成的大网洒向了海洋之中，每一条雷霆都变得极为的粗壮！

    与此同时，布置在不同方向的七道灵雷，亦是发出炽烈的光芒，雷鸣嘶吼大作！

    色彩各异的雷霆相互纠缠交织，携带着开天辟地般的威势，如是一尊神灵勃然动怒，于九天之上打出对这世间严厉的惩罚！

    密密麻麻的各色雷电迅猛劈下，在熔岩海洋中纵横蜿蜒，很快就将天炎洞虚雷整个淹没了去。

    “小子，哪怕你掌控了雷电法则，也无法奈我何！今日之仇暂且记下，你身上的七道灵雷，总有一天我会亲自向你讨回！”

    天炎洞虚雷冷静了下来，大声叫道。

    他自忖，这紫袍青年的修为尚比自己要弱上一筹，若是自己想走的话，那他想拦也拦不住！

    大不了，暂时放弃争夺其身上的七道灵雷。

    只要自己能够先一步找到其余的灵雷，那便很快就能进入天圣之境。

    到时候再来报今日之仇，七道灵雷还不是手到擒来，依旧会是自己的囊中之物！

    心中萌生出退意的同时，天炎洞虚雷便是有了动作！

    那团幽黑色的灵雷之身，直接朝着杜少甫相反的方向横掠，速度迅疾无比，企图摆脱紫袍青年的这一招“天雷罚世”，从而逃遁！

    “想走？你走得掉么？”

    杜少甫冷冷开口，手臂轻轻一晃，漫天的雷霆同时受到指引，直接都是一个拐弯，向天炎洞虚雷追击而上！

    可怕的雷霆猛烈轰出将空间撕出一道又一道裂缝，整个熔岩海洋被搅动，震荡出滔天的巨浪，直冲九霄而去！

    在杜小妖、圣妖殿苍松与彩霞仙子、黑水河血袍人，还有一干散修所在的那处火山空间之中，猛然间有着狂猛无比的岩浆浪潮冲腾而上！

    在众人都来不及反应之际，直接是灌满了整个空间，继而从火山口的位置喷发开去！

VIP卷：扶摇万里_第二千五百八十二章：老子成全你！

    第二千五百八十二章：老子成全你！

    此时的绝阴山，正处在漆黑的夜幕之中，没有任何光线，伸手不见五指！

    然而那炽热的岩浆喷涌，从火山口直冲而上，瞬时将整个山脉照得透亮！

    火山口在冲击之下而炸开，扩大了百倍，熔岩洒向九天十地，犹如漫天璀璨的烟花炸开，火雨迸溅，瑰丽灿烂！

    一条又一条的身影，夹杂在这火雨之中，被甩向了高空！

    “靠，发生什么事了！”

    有妖灵大叫着，体内的妖能不停运转，控制着自己的身体。UU小说 www.uu234.com更新最快

    好在所有来到这绝阴山的妖灵，都是实力不俗之辈，并没有在这样的状况之下受到太大的伤势。

    一个个修为施展开来，都是相继稳住了身形，继而分出各自的阵营，在远处集结着。

    “难道是天炎洞虚雷出世了么？”

    “那先前下去的几个人为什么都没有出来，难道出了什么事吗？”

    “对，冰火二祖、戴柳、无主断剑，还有那从外界而来叫做杜少甫的人类小子，一个都是没有出来！”

    众妖灵纷纷惊道，怀疑是天炎洞虚雷出世，才造成眼下这般可怕的场面。

    如果真是这样，那天炎洞虚雷也太强悍了，根本不是他们所能对抗的，想要将之收服，恐怕不容易！

    正在众人惊叹之际，只见一团光芒自炸开的火山口飞快冲了出来。

    这团光芒幽黑之色，气息并不显得多么恐怖，但其所过之处，虚空都无声地湮灭着，一条漆黑的痕迹在其身后成形，像是焰尾一般，冒着黑烟！

    这样的景象，就极为的可怕了！

    “天炎洞虚雷！那是天炎洞虚雷！”

    有妖灵大叫，指着飞掠出来的幽黑光团。

    “快，拦住它！”

    “一起出手，别让它跑了！”

    “抓住它，天炎洞虚雷就是我的了！”

    一个个妖灵大吼着，同时出手，可怕的攻击浩荡而出，山呼海啸一般席卷。

    所有人心中都只有一个想法，必须要将天炎洞虚雷拦住，至于最终谁能够得到它，那便各凭本事好了！

    圣妖殿的苍松、彩霞仙子，黑水河那名叫血徒的血色衣袍者，苍山骷髅等皆是展开了动作！

    只有杜小妖凌空静静而立，一双瞳孔之中泛着灼灼的金光，向火山口的位置凝视而去，因为，杜少甫还没有出来！

    “滚开！”

    受到四名圣妖境圆满的强者拦截，天炎洞虚雷陡然大喝！

    话语声甫一响起，天空就是被一道雷霆撕裂，由极东贯穿至极西，恍若是苍天张开了巨口！

    “轰……”

    雷鸣炸响，伴随着一道闪电蜿蜒劈落，直接是落在了一众出手拦截的人群之中！

    雷霆万钧而下，地面亦是被扯出一道横亘整个山脉的裂缝！

    苍松、彩霞仙子、苍山骷髅、血徒等人皆被这一击震退。

    苍松本体乃为一株松树，被雷霆劈击之后，皮肤都变得焦黑。

    苍山骷髅那张如同干尸头骨之上，被轰裂出一道缺口，却是没有血液流淌。

    彩霞仙子与血徒二人身上的气息，都是同时弱去了五成，吐血而退！

    至于那些圣妖境圆满以下的，人人都被直接轰到了地上，落进了那巨大的裂缝之中，半晌没有看到动静，不知死活！

    天炎洞虚雷一击之下，竟是可怕至斯，让得所有人均受到了极大的创伤！

    “不可力敌，快退！”

    苍松轻喝，当先退到了远处，心中止不住的震骇。

    彩霞仙子、苍山骷髅、血徒等人见状，也是不敢再对天炎洞虚雷出手，只是胆战心惊地撤向了远方，为其让出了一条道路。

    “好可怕的天炎洞虚雷，居然这么强悍！”

    彩霞仙子抬起袖子，轻轻拭去玉唇上的血迹，骇然说道。

    其他人闻言，纷纷点头表示赞同！

    那可怕的雷霆攻势，若是再挨上一下的话，没有人能扛得住！

    只不过，让这些人感到惊异的是，天炎洞虚雷一击过后，却没有在这处地带逗留片刻光景，而是在漫天火雨之中，向远方急掠。

    这一幕，让他们疑惑的同时，也是同时松出了一口气，庆幸无比！

    如果那天炎洞虚雷带着敌意，执意要出手将他们灭杀的话，以其那恐怖的实力，在场这几位圣妖境圆满的强者，搞不好还真的要折损一两位！

    “冰火那两个家伙怎么没有出来，不会出什么事了吧！”

    眼睁睁地看着天炎洞虚雷飞快而去，苍松的心头却是大惊。

    他的话语一出，彩霞仙子的俏脸上也布上了凝重之意。

    来自黑水河一方的血徒，亦是将目光投向了火山口处。

    只有苍山骷髅沉着一张鬼脸，却是带着幸灾乐祸之意！

    “桀桀桀桀……天炎洞虚雷这这般强悍，那人类小子岂有还活着的道理！想必此时，应该是成为了一具死尸，被熔岩吞噬得连一个渣渣都没有留下了吧！”

    苍山骷髅阴沉而笑，因为先前杜小妖给自己造成的震慑，使得他心中对杜少甫怀上了几分恨意，巴不得那紫袍青年直接死在了岩浆之中才好！

    至于圣妖殿的冰火二祖、黑水河的军师戴柳、还有与自己同为散修的无主断剑，是生是死，则不必挂在心上！

    “鬼东西，你要是想死的话，老子立刻就来成全你！”

    苍山骷髅的话，让杜小妖顿时大怒！

    然而，就在他准备出手，将苍山骷髅收拾掉之时，火山口的位置便是传来了巨大的动静！

    那里，绵绵不绝的岩浆还在继续喷发着，有四道身影几乎同时被裹挟而出。

    这四道身影，可不正是在杜少甫之后进入熔岩之中的冰火二祖、戴柳和无主断剑四人！

    四人出现之后，在高空飞行之时一副摇摇欲坠的模样，明显是遭到了重伤，连身体都很难控制住！

    在他们出来之后，事情还没有结束，只见又是一道身影跟随其后，飞出了火山口！

    那是一道紫袍青年的身影，与冰火二祖等人不同的是，这青年浑身缠绕着雷电光芒，七道灵雷盘旋在其身周，将他衬托得犹如一尊降临世间的神祇一般，气势极为凶悍！





    */

    public static String fomaToDatas(String data){
        DateFormat fmt=new SimpleDateFormat("yyyyMMdd");
        try {
            Date parse=fmt.parse(data);
            DateFormat fmt2=new SimpleDateFormat("yyyyMMdd");
            return fmt2.format(parse);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }
    //根据时间区间获得日时间段
    public static String getDays(String start, String end) throws java.text.ParseException {
        StringBuilder time = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date dBegin = sdf.parse(start);
        Date dEnd = sdf.parse(end);
        time.append(sdf.format(dBegin)+"~"+sdf.format(dBegin)+"~");
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            time.append(sdf.format(calBegin.getTime())+"~"+sdf.format(calBegin.getTime())+"~");
        }
        return time.toString();
    }
    /**
     * 日期解析
     *
     * @param strDate
     * @param pattern
     * @return
     */
    public static Date parseDate(String strDate, String pattern) {
        Date date = null;
        try {
            if (pattern == null) {
                pattern = YYYYMMDD;
            }
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            date = format.parse(strDate);
        } catch (Exception e) {

        }
        return date;
    }
    public static int getYear(String date) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(parseDate(date));
        int year = c.get(Calendar.YEAR);
        return year;
    }
    public String getYearMonth (Date date) {
        return formatDateByFormat(date, "yyyy-MM")  ;
    }
    /**
     * 取得指定月份的第一天
     *
     * @param strdate
     * String
     * @return String
     */
    public String getMonthBegin(Date date) {
        return formatDateByFormat(date, "yyyy-MM") + "-01";
    }

    /**
     * 取得指定月份的最后一天
     *
     * @param strdate
     * String
     * @return String
     */
    public static String getMonthEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        return formatDateByFormat(calendar.getTime(), "yyyyMMdd");
    }
    /**
     * 以指定的格式来格式化日期
     *
     * @param date
     * Date
     * @param format
     * String
     * @return String
     */
    public static String formatDateByFormat(Date date, String format) {
        String result = "";
        if (date != null) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                result = sdf.format(date);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
    /**
     *
     * @param strDate
     * @return
     */
    public static Date parseDate(String strDate) {
        return parseDate(strDate, null);
    }


    /**
     * format date
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        return formatDate(date, null);
    }

    /**
     * format date
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String formatDate(Date date, String pattern) {
        String strDate = null;
        try {
            if (pattern == null) {
                pattern = YYYYMMDD;
            }
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            strDate = format.format(date);
        } catch (Exception e) {

        }
        return strDate;
    }

    /**
     * 取得日期：年
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int year = c.get(Calendar.YEAR);
        return year;
    }

    /**
     * 取得日期：年
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        return month + 1;
    }

    /**
     * 取得日期：年
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int da = c.get(Calendar.DAY_OF_MONTH);
        return da;
    }

    /**
     * 取得当天日期是周几
     *
     * @param date
     * @return
     */
    public static int getWeekDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int week_of_year = c.get(Calendar.DAY_OF_WEEK);
        return week_of_year - 1;
    }

    /**
     * 取得一年的第几周
     *
     * @param date
     * @return
     */
    public static int getWeekOfYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int week_of_year = c.get(Calendar.WEEK_OF_YEAR);
        return week_of_year;
    }

    /**
     * getWeekBeginAndEndDate
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String getWeekBeginAndEndDate(Date date, String pattern) {
        Date monday = getMondayOfWeek(date);
        Date sunday = getSundayOfWeek(date);
        return formatDate(monday, pattern) + " - "
                + formatDate(sunday, pattern);
    }

    /**
     * 根据日期取得对应周周一日期
     *
     * @param date
     * @return
     */
    public static Date getMondayOfWeek(Date date) {
        Calendar monday = Calendar.getInstance();
        monday.setTime(date);
        monday.setFirstDayOfWeek(FIRST_DAY_OF_WEEK);
        monday.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return monday.getTime();
    }

    /**
     * 根据日期取得对应周周日日期
     *
     * @param date
     * @return
     */
    public static Date getSundayOfWeek(Date date) {
        Calendar sunday = Calendar.getInstance();
        sunday.setTime(date);
        sunday.setFirstDayOfWeek(FIRST_DAY_OF_WEEK);
        sunday.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return sunday.getTime();
    }

    /**
     * 取得月的剩余天数
     *
     * @param date
     * @return
     */
    public static int getRemainDayOfMonth(Date date) {
        int dayOfMonth = getDayOfMonth(date);
        int day = getPassDayOfMonth(date);
        return dayOfMonth - day;
    }

    /**
     * 取得月已经过的天数
     *
     * @param date
     * @return
     */
    public static int getPassDayOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 取得月天数
     *
     * @param date
     * @return
     */
    public static int getDayOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * 取得月第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDateOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    /**
     * 取得月最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastDateOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    /**
     * 取得季度第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDateOfSeason(Date date) {
        return getFirstDateOfMonth(getSeasonDate(date)[0]);
    }

    /**
     * 取得季度最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastDateOfSeason(Date date) {
        return getLastDateOfMonth(getSeasonDate(date)[2]);
    }

    /**
     * 取得季度天数
     *
     * @param date
     * @return
     */
    public static int getDayOfSeason(Date date) {
        int day = 0;
        Date[] seasonDates = getSeasonDate(date);
        for (Date date2 : seasonDates) {
            day += getDayOfMonth(date2);
        }
        return day;
    }

    /**
     * 取得季度剩余天数
     *
     * @param date
     * @return
     */
    public static int getRemainDayOfSeason(Date date) {
        return getDayOfSeason(date) - getPassDayOfSeason(date);
    }

    /**
     * 取得季度已过天数
     *
     * @param date
     * @return
     */
    public static int getPassDayOfSeason(Date date) {
        int day = 0;

        Date[] seasonDates = getSeasonDate(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);

        if (month == Calendar.JANUARY || month == Calendar.APRIL
                || month == Calendar.JULY || month == Calendar.OCTOBER) {// 季度第一个月
            day = getPassDayOfMonth(seasonDates[0]);
        } else if (month == Calendar.FEBRUARY || month == Calendar.MAY
                || month == Calendar.AUGUST || month == Calendar.NOVEMBER) {// 季度第二个月
            day = getDayOfMonth(seasonDates[0])
                    + getPassDayOfMonth(seasonDates[1]);
        } else if (month == Calendar.MARCH || month == Calendar.JUNE
                || month == Calendar.SEPTEMBER || month == Calendar.DECEMBER) {// 季度第三个月
            day = getDayOfMonth(seasonDates[0]) + getDayOfMonth(seasonDates[1])
                    + getPassDayOfMonth(seasonDates[2]);
        }
        return day;
    }

    /**
     * 取得季度月
     *
     * @param date
     * @return
     */
    public static Date[] getSeasonDate(Date date) {
        Date[] season = new Date[3];

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        int nSeason = getSeason(date);
        if (nSeason == 1) {// 第一季度
            c.set(Calendar.MONTH, Calendar.JANUARY);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.FEBRUARY);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.MARCH);
            season[2] = c.getTime();
        } else if (nSeason == 2) {// 第二季度
            c.set(Calendar.MONTH, Calendar.APRIL);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.MAY);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.JUNE);
            season[2] = c.getTime();
        } else if (nSeason == 3) {// 第三季度
            c.set(Calendar.MONTH, Calendar.JULY);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.AUGUST);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.SEPTEMBER);
            season[2] = c.getTime();
        } else if (nSeason == 4) {// 第四季度
            c.set(Calendar.MONTH, Calendar.OCTOBER);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.NOVEMBER);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.DECEMBER);
            season[2] = c.getTime();
        }
        return season;
    }

    /**
     *
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度
     *
     * @param date
     * @return
     */
    public static int getSeason(Date date) {

        int season = 0;

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        return season;
    }

}