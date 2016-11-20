package leetCodeWeeklyContest10.problem3.num462_MinimumMovesToEqualArrayElementsII;

import java.util.Arrays;

public class Solution3 {
    public int minMoves2(int[] nums) {
        if (nums.length > 0) {
        	int moves = 0, sum = 0;
        	for (int i = 0; i < nums.length; i++) sum += nums[i];
        	boolean gotNearestPo = false, gotNearestNe = false;
        	int avg = sum / nums.length, poCnt = 0, neCnt = 0, avgCnt = 0, nearestPo = 0, nearestNe = 0;
        	for (int i = 0; i < nums.length; i++) {
        		if (nums[i] > avg) {
        			if (gotNearestPo) {
        				if (nums[i] < nearestPo) nearestPo = nums[i];
        			} else {
        				nearestPo = nums[i];
        				gotNearestPo = true;
        			}
        			poCnt++;
        		} else if (nums[i] < avg) {
        			if (gotNearestNe) {
        				if (nums[i] > nearestNe) nearestNe = nums[i];
        			} else {
        				nearestNe = nums[i];
        				gotNearestNe = true;
        			}
        			neCnt++;
        		} else avgCnt++;
        		moves += Math.abs(nums[i] - avg);
        	}
        	System.out.println(moves);
        	if (poCnt > neCnt + avgCnt) moves -= (nearestPo - avg) * (poCnt - neCnt - avgCnt);
        	else if (neCnt > poCnt + avgCnt) moves -= (avg - nearestNe) * (neCnt - poCnt - avgCnt);
        	return moves;
        }
        return 0;
    }
}
/*
Input:
[1,0,0,8,6]
Output:
8
Expected:
14

More Details 

Input:
[1,2]
Output:
0
Expected:
1

Input:
[1,1,2]
Output:
2
Expected:
1

Input:
[1334, 1500, 4169, 724, -3522, 4358, 1962, -536, 705, 3145, -1719, 1827, 4961, -4509, -2005, -3058, -173, 436, -2609, -396, -1098, -4847, -4708, -2618, 2421, 3716, 4718, 4895, 447, -3274, -229, -3462, -3131, 4912, 667, 1299, 2035, 4894, 3703, -1189, -3678, -4667, 2673, -336, 141, 2711, 3253, 1868, 547, 2644, -2338, -2243, -4963, -2141, 3723, 4741, 2529, -4222, -2684, -1965, -2810, -3158, -4712, -4894, 4040, 3942, 4264, -2352, 2446, -1195, 890, 1729, -630, 350, 6, -3899, -607, -1452, 4629, -2377, -916, 4954, 3756, -3160, -34, 2376, -1069, 1308, 1944, -2561, -374, -3677, 537, -3462, 1118, -2918, -2071, 1541, -167, -3885, -361, 4658, -2296, 4930, -1023, -2694, -3327, -2614, 21, 3745, 1924, 4072, 1270, 829, 1777, 573, 97, 1512, -1014, -1710, 4161, 3636, -2645, -233, -1345, 574, -969, -2948, 2350, -3850, 1941, -3276, -1034, -1570, -3893, -4809, 3007, -3663, 457, -2713, 2753, -4617, -55, 3909, -2791, 4758, -779, 3588, 1422, -54, 2506, -1970, 1413, 4168, -4100, -2409, 3762, -3345, 2410, 1359, 2624, -4463, -3452, 1483, 2595, -959, -1398, -650, -4709, -4164, 4374, -3980, -404, -979, 2348, -1801, 4668, -516, 3281, -266, -4947, -3001, 1418, 2938, 1900, -1212, 3127, -4533, -1272, -107, -352, -2517, 2807, -2579, -690, 1617, -2187, 4514, -691, 2616, 3935, 2451, -4400, 249, 1519, -3444, -2202, -4697, 1224, -3992, 844, -2391, -11, -2298, -1805, -4515, -1907, -657, -4477, -3413, 4314, 4503, 2448, 200, -1542, 1618, -4420, 4796, -202, 281, 4589, -4202, 3009, 2157, -4528, -1378, 3538, -2708, 1038, -821, 3190, 4657, 2958, 1191, 4815, -2112, 4156, -3489, 1202, -2366, -728, -4945, -4672, -2354, 1362, -114, 3875, 3433, 4869, -4858, -1156, -3584, -3119, -3002, -4678, 3651, -4979, 699, -1443, 3476, 2892, -611, 75, -4288, -2400, -2490, -3997, 1869, 2861, -312, -1599, 4789, 255, 1423, 2, -4415, -818, -4715, 2088, -3574, 3617, -1243, 4832, -4068, -831, -2846, 721, 2189, 4976, -3671, -2632, 3692, -3575, -4445, -1566, 1549, 2441, 4512, -4855, 3060, -3282, -1247, 1139, -2577, 1279, 996, 1687, -2471, -2451, 2437, 4866, -2051, -4807, -1805, -1703, -4584, 3286, 1105, -512, 1282, -2545, 734, 3114, -3299, -3684, -4329, 786, -2737, -687, -645, -3815, -4947, -4088, -4192, -3168, -4055, -687, 2756, 3321, 4558, -1354, 2982, -4519, -856, -1804, -4778, 2129, -2839, 535, -4550, -3827, -4534, -2956, -3341, 1292, 1439, 2253, -4976, 1154, 4510, -255, -4351, -1814, 3313, -526, 3022, -2832, -982, 3787, 4905, 2958, 2391, -4798, -1375, 1477, -586, 4314, 824, 4334, 874, -628, -4841, -3167, 3070, 2487, 3297, 2518, 3177, 2773, -2730, -3237, -2332, 2192, -1015, -1898, 3480, 4213, 2627, -198, -901, -4473, -2375, -3457, -3076, -3977, 4972, -1939, -819, -3997, 2432, 2505, 2593, -2275, -1969, 3492, -4858, 2222, -3714, -1936, 2900, 4187, 3360, -2587, -4026, -730, 4170, -4765, -4167, 4711, 760, 3896, -333, 2285, -2450, -4860, -1306, -2305, -3376, 3019, -2875, 1576, -3306, -2342, 1302, 2371, -2534, -322, -2407, -1149, 484, -3982, 3464, -3881, -1848, -2200, 3087, -3940, -3074, 4010, -243, -2830, -4685, 4576, -4773, -2957, -2242, 2164, 109, 2882, 2086, 4565, -1513, 4577, -526, -2375, 627, 629, -3072, 423, 3520, 1902, -38, -4877, -404, -1263, -1739, -4805, -2475, -3736, 3260, 1202, 3116, 30, -4674, 4011, -4229, 1411, 547, -3847, -3480, 4790, -76, -4812, -3237, -60, -4149, 3662, -1171, -4100, 2713, 3958, 2578, 3365, -1993, -3523, -3800, 1058, 1439, -2697, -2240, 4357, -2676, 1477, 108, -3887, -113, 4801, -2150, -540, -2572, -2007, 2384, 4405, 1540, -3889, 3704, -2165, -2644, 1072, 4350, 3823, -515, -4444, -1784, -3374, 4357, 3526, -1643, 4337, -1729, -1131, 4361, -2104, -1978, 4617, -4888, -2283, 3696, -3415, -959, -577, -871, -771, -435, 1559, 3932, -2704, 4855, -2947, 1962, -1416, 4734, 1654, 1972, -3543, -631, -2468, -2037, -2393, -2517, -4089, -3365, -4933, -2152, -325, -2062, -2777, -2858, -1246, 1511, -2259, -4825, -3541, 2825, -1779, 2870, -3374, -3066, 205, -3217, -1150, 2398, -2721, -2299, -2807, -2266, -3363, 1534, 556, -3007, -4824, 705, 1962, -4452, 881, -4700, -587, 1641, 4855, -145, -1858, -3538, 2611, -4123, -4576, -2322, -3248, 3443, 3296, -2327, -4960, 4313, -4125, -4928, -2182, -4390, -3983, -68, 3112, -4305, -1831, -1169, -4960, 1488, 3685, 4090, 4497, -2411, 990, 145, 4353, 4314, 3651, 1740, -2956, -3742, -4665, 3759, -3808, 2605, 264, -2819, 3503, -1171, -1225, -4392, 4292, 997, 2549, 4556, 561, -3373, 1467, 4541, 1129, -3760, 2813, 4174, -4399, 1077, -4785, 3683, 3213, -1008, 824, 601, -1608, 759, -2330, 1428, 3027, -916, -4925, 3786, 498, -30, 1287, -1153, -2396, -4497, -3779, -2337, 706, -2637, 4010, -2829, 2489, 3240, -2836, 542, 2619, -4087, 2591, 1704, -3182, 4232, -4250, 205, -25, -3461, -4697, -3578, -3902, -3753, -1416, -1352, -2029, 2864, -2087, -3925, -3455, 3712, 2546, 3678, -3231, 262, 3519, -1015, 3289, 944, -2135, 3540, -1755, 508, 3318, 2870, 4601, 3323, -3868, -528, 2152, 87, 3570, 4763, 4901, 2103, -577, -1473, -3400, 1969, -985, 565, -4972, -3457, 347, -2912, -2057, -2363, -2591, 1463, 49, -319, -3412, -3658, -4392, -2940, -3779, -3242, 4954, -4112, -854, -4310, 2949, -2157, -3570, 620, -4252, 2067, -464, -4217, 3035, -2774, 185, 2038, 4853, 629, -3776, 748, 4923, -1641, -2743, -234, -56, -45, -1682, -2274, 411, -3975, -4645, -3999, -2451, 4496, 3584, 4515, 2964, -1658, 3075, 2913, 1142, -3804, -3052, 72, -4574, -394, 1173, -571, -2596, 1705, -4374, 4812, 4375, -4907, 1565, 1036, -264, 4141, -4186, 994, 3256, 1652, -1064, -4162, -4518, -3645, -3985, -3869, 3230, 2841, -375, -2989, -2363, -814, 4690, -3350, 662, -3366, -4107, -4647, -3584, -1548, -992, 2262, -2767, 454, 1303, 1634, 1303, -744, -4852, -3876, -2683, -787, 2109, -972, 4200, -3920, -3682, 1858, -950, -845, -3639, 264, -3097, -1324, 4643, 1909, -98, -1439, 3489, -52, -3718, -1347, -4326, -2780, 402, 1923, -1169, 4369, -1122, -4741, 4008, -2381, -1029, -4997, -3055, 4781, 1504, -2608, -2315, 313, 1698, 589, -2278, 938, 4037, 1410, -3539, 1234, -2492, 4961, -1041, 1493, -3485, 269, -63, 3869, -4942, -300, -1029, 1264, 117, 1215, -445, 2815, 3330, -1961, -4788, 4288, 3082, -3046, 1085, -4290, -516, -226, 3380, 4815, 951, 1541, 3115, -3321, 2110, 898, -1927, -4212, -1023, 3132, 4956, 3689, 1113, -4992, -2059, 790, -3277, -3637, -4972, 184, -222, 2200, 71, -3115, -3026, -3929, -3667, -2133, 1153, -705, -2832, -4175, 4676, 629, 3650, -2402, -1691, -307, -314, -4920, -4884, -2751, 1667, -3472, 1679, 2864, 4421, 3405, 3826, 1816, 2516, 2726, 3666, 4087, 2681, 4964, -3660, 686, 1021, -3338, -279, 1064, 4309, -4585, 2902, 4873, 2124, -1059, -2255, -3238, 3423, 2531, -194, -2732, 4318, 602, -3093, -693, -1519, -3988, -3864, 1630, -886, 1809, -916, -1444, -2710, -3707, 4996, 4152, -3946, 345, -292, -4752, 2491, -1288, 131, -4886, 1439, 2958, -278, 4704, 1995, -3948, 269, 2479, 3238, 1423, 2918, -4134, 2659, -2502, 3486, -3804, 2462, 1633, -2842, -2978, -3854, 3392, -1963, -1075, -4353, 4458, 1602, -4193, -902, 2830, 4292, -400, 2278, -4201, 3352, -4552, -1118, -4460, 3315, -425, 3762, 4567, -2664, 3397, -3582, 4897, 828, -1149, 1816, -770, -551, 1925, -4342, -4771, -480, -4060, 4560, 147, 162, -3345, -4325, -4208, -2639, -3246, 1398, -1854, 3714, 1946, -3812, 4569, 3638, 2663, 75, -485, -3479, -4525, 615, -4472, -1766, -2430, -4095, 4464, 4557, 3962, -839, -4476, -2451, 2469, -4670, -3077, 3350, -667, -2075, -4090, 4737, 1336, 3337, -3722, -2607, 2636, -4286, 3164, -3409, 4949, 4135, -2495, -1663, -4996, 1337, -2377, 3664, 4970, 608, -4432, 4281, 2085, 4152, 3373, 3652, 3194, 4876, -1174, 3396, 2572, 1249, -360, 4174, 3819, -4057, -2389, -3059, -4711, 3419, 565, -1195, 2585, 1216, -3550, -3385, -2391, -3936, 4166, 1893, 1074, -1491, -4700, 4695, 4573, 589, -1839, -3828, 2968, 2358, 1031, 1268, 4426, 3510, -4578, -4226, 3779, -4090, -1448, -818, 391, 495, 764, -4126, -3636, -98, 3255, -540, -4526, 1972, 1821, 1122, 547, -3423, 4789, 605, -4805, 2594, 2950, 1343, -4246, -2519, -3988, -3328, -1561, -1572, 912, 4762, 967, -592, -585, -3092, 2223, -3241, 1434, 204, 4486, -681, -4042, 945, 1806, 3166, 3700, -3633, 2692, -3213, 3532, -4444, -4026, -1553, 21, 3283, 1222, 4331, -2624, 3583, 1948, -2277, 2982, -2982, -224, 4220, -3889, -2818, -1144, 4490, 3925, -676, 1486, 4677, 969, -3357, 2534, 677, -2332, -3932, -3009, -2804, 2783, 1828, 2727, 4426, 871, -4303, 2612, 3703, -3973, -3592, 545, 4508, 2185, -4762, -763, 1443, -3687, -2499, 3850, 128, -2889, -1350, 3149, -3808, -3546, 869, -4319, 2465, -4733, 2713, 4793, 3634, 472, -4028, -2170, -99, 3442, 177, -1123, 770, -4298, -636, -3619, 1590, 3823, -2763, 3023, -2821, 1595, -4831, -2673, -2958, -3690, 3182, -3942, 2926, 4487, -3330, -2472, 651, -2742, 2213, 4860, 783, -3714, -2258, 3610, -528, 2128, 3434, 841, -4282, -1497, -133, -135, -4062, -3119, 4257, -2250, 3614, 3598, 3458, -2339, 1063, -2244, -4193, -4722, 4489, 4435, 1365, -2925, 2586, -3614, 2833, 3360, -1670, 1048, 3928, 4492, -2567, -1160, 1766, -3265, 4810, -3401, -3163, -3108, -3018, 2328, 4352, -3631, -3756, -3206, 1608, 4252, -3353, 2432, 4535, 2208, -1736, -1503, -1757, 2649, -2985, 1841, -4811, 1100, 4812, -4352, 4523, 4851, -526, 3633, 4891, 2200, 4854, 4990, 697, -81, 2780, -2422, -2069, -2456, -1660, -1513, -4101, -2475, 3483, 538, 2492, 1193, 3252, 11, -3440, 834, -3160, -3503, -2215, 3529, -3460, 3805, 3791, -1608, -1790, -1451, -3422, 1979, -4029, 4277, -4927, -4807, -3380, -3503, -1174, -3724, 4790, 1582, -1422, -3841, -4582, 1489, -4841, -1551, -2076, 4072, -4620, 2008, 2967, -4792, 1477, 3503, 370, -2393, -804, -2926, -1278, -2389, 4019, 3761, -3944, -2110, -3837, 1683, -1284, 4932, 452, -2259, -46, 1813, -2138, -4604, 460, -4385, -4096, -2401, -4864, -320, 4198, 2032, -613, -2416, 2240, -1483, 2006, 3670, -4759, 3882, 249, -1477, -3242, -2895, 4621, 2095, 2296, 4916, 678, -4822, -1421, 58, 2577, -2250, -993, -1271, -919, -2005, -2322, -324, 2753, -4101, -3216, 565, -1907, -1392, 1172, -3757, 4929, 2514, -4832, 55, -3809, 973, 3922, 1748, 651, -4014, -2856, 1446, -3423, 1517, -371, 4916, 874, 791, 469, -2088, 3146, -4307, 4091, 4815, 1949, 1857, -4360, 1052, -4764, 3551, 4487, -3774, 3162, 1955, -1817, 3394, -4820, 1097, -1935, 2065, -2487, 4261, -2422, -3922, 1878, -860, -389, -3053, -2555, -4830, 4975, -1511, -250, 1149, -1667, -1135, -2786, 2282, 2007, 2432, 3896, 1367, 3522, -118, -3190, 2641, 2231, -2813, 1705, 1479, 1321, 1538, -3649, 4447, -792, 4646, -2724, 759, -4811, -4578, 2666, 3486, -1545, -2972, 4614, -140, 4253, -3223, -3652, -2497, -4139, -2569, 4082, -2545, -803, -2894, 3752, 821, 2296, 1281, 1021, -545, 947, 2124, 3318, 4135, -3624, -3226, 4859, -2, -2926, 4253, 1922, -4365, -3357, 3888, 3153, -1768, -253, 3680, 4926, 678, 1450, -199, -39, -801, -4145, 1363, 716, -4427, -3439, -1755, 1473, 3274, -3450, -647, -3819, -713, -2301, 3110, 3643, 2465, 2172, -2471, 4981, -2888, -1524, -619, 3247, 1890, 1671, 3805, -2628, -4968, -1011, 4320, -1835, 431, 4658, -3707, 2206, 1578, 1948, -2794, 2171, 3166, -1604, 1697, -3980, -1306, 529, -212, -4891, 2984, -3031, 3978, -3383, -985, 1626, -1316, 4168, 2906, 928, -2903, 3118, -610, 199, -3215, -514, 4199, -2580, -4290, 3271, 813, 2415, 1085, -4682, -1420, -3669, 2267, 3387, -1556, -1814, -493, -640, 2827, 3074, 1431, 2152, -4729, -4732, -307, 4885, -4663, -3689, 2604, -2323, -4594, 2768, 4022, 4413, 0, -4458, 2537, -4962, -3612, 2355, -1711, -3353, -1819, -1907, 1584, -4013, -4239, -4507, 3217, 4501, 2482, 4447, 665, -4247, -2896, 84, 4095, -1475, -4779, -1036, -3219, -128, 3106, -1344, -1657, -2407, 2080, 1080, -132, -3589, -1287, -4032, -1749, 2216, -2921, 3768, 2040, -3469, -2067, -1221, -4337, -2741, 1653, 2936, -2905, -635, -3126, 2720, 1835, 680, 3976, 3455, 725, -929, -192, -1441, 4156, 602, 2832, 2905, -4560, 2375, -3438, -2115, -3038, -3920, -3164, -4203, -3798, -4492, -4920, 340, -2924, 4058, -3507, 2740, 3546, -4526, -227, 4097, 3880, -1665, -3928, -1600, -4293, -2045, -4334, -859, -1412, -2519, 2168, 3315, 4396, 1225, -3991, -2988, 3136, -3545, 3762, 43, -4258, -4979, 2922, -488, 4248, 1018, 2368, -1283, 4714, 2650, -1710, -1665, -2241, -1831, -3105, 303, -2360, -3021, -801, 4105, -209, 3661, 3681, -1348, 3753, -967, -2971, 987, 2042, 1253, -4917, -3580, 814, -2282, -2756, -3937, 2229, -4348, 3864, -231, -4530, 5, -3953, -3406, -3513, -674, -1724, -3677, 1540, 2679, -1010, -2412, -290, 4271, 2945, 4221, 3470, -4817, -1411, -1045, -22, -221, 6, -1738, -4865, -1513, 2196, 4033, -2912, -2065, 4779, 993, -210, -38, 3965, -3999, 4105, -3193, -433, -2331, -1866, -2329, -3543, -2002, -1455, -1403, -782, 3838, -156, 2372, 3563, -3972, 4264, 3801, -277, -1510, 2604, -3399, -773, -3803, -1308, 4771, -4637, 4301, -2637, 2721, -1435, 2421, -1555, 3610, -4505, 1741, 22, -3188, 4151, -1985, 3055, -1607, 3738, 279, 4882, -3392, -2346, -1178, -2293, -755, -3662, -4856, -2710, -3661, -1846, -396, -377, -2775, -4922, -3276, -3019, -2670, 4733, 3223, -4406, 4130, 3846, -13, 4445, 3805, 3616, 750, -4511, 2338, -3037, 3135, -303, -2791, -3370, -1776, -3092, 1737, -526, -3080, 2372, -4707, -1145, 1734, 4561, -3944, 2606, 3184, 2075, 3382, -881, 1741, -4568, -316, -2221, -2721, 3283, -4333, -4164, -875, -882, -2263, 3028, -2881, -4423, -4263, -909, -4444, -2205, 1060, -3099, 3793, -1568, -2864, -420, -125, 907, -3816, 3074, 3719, 1790, -4524, -4959, -1649, 3329, 1290, -2026, -1928, -1409, -2811, 787, -3510, -1761, -107, -1947, 2063, -4319, 903, 2005, -824, 3479, -3305, 1139, -2532, -1002, -3917, -1361, 4515, 2621, 4993, 826, 722, -1162, -172, -2419, -601, 3978, -3109, -3977, 1943, -166, -757, 2349, -2298, 3707, -4498, 141, -4313, 3346, 891, -363, 3413, -3600, -2184, -3310, -1838, 3935, 4126, 4410, 4877, -3618, 1260, 2189, 1705, -1126, -2337, -4278, -2805, -2434, 1360, 1038, 3588, 2811, 3245, 4467, -2575, 1867, -1811, -4458, -1937, -3453, -4498, 4617, 4099, 23, 2226, -3797, -4952, -3949, -3430, 3636, 4458, 967, 3456, 4405, -3469, 4962, 1819, 2975, -4444, 2531, -3505, 3044, -4409, 1803, -1612, 3915, 2450, -2681, 1272, 791, 4383, -4867, -3225, -358, -1431, 3300, 2954, -2922, -1415, -2743, 333, -4107, -4510, -4897, -250, 2233, -4278, -729, 4611, 3990, -4662, -3359, -1742, 4047, -2648, 4658, -4521, 302, -2317, 3990, -4998, 568, -578, 1895, 1135, 3008, -2639, 1742, -2806, -1301, -1812, -4822, -958, -3643, -1059, -3153, 2469, 1345, -620, -3087, -36, 710, -4939, 385, -4927, 2504, 4462, -2297, 3102, -3931, 154, -1471, -3448, -2926, 4149, -1270, -2756, -4156, -1951, -882, -935, 1363, 4552, 3773, 3470, 4731, 1747, 2511, 869, -602, -4502, 2103, 2352, 679, 3053, -1957, -478, -3912, -3437, 834, 4850, 2022, 2240, -3089, 4492, 651, 3580, 477, 2616, 4876, 4178, 220, -385, -2652, 1798, -2821, -3365, 1857, -2117, -3338, 3902, 3262, 4420, 4770, 4022, 4273, 841, -2314, 3888, -1083, -3283, -3108, -1302, -3733, -3251, -4935, -4611, 1932, 619, 1081, -2997, 4130, -1972, 3631, -411, -1848, 3630, 4172, 4864, 1407, -2705, 428, 4681, 3490, 1610, 1177, -3929, 236, 1459, -4357, 1840, 2633, 2037, -1107, -2370, -4726, -2007, 3782, -2797, 2461, 3290, 4662, -2693, -4003, -3849, 3423, 3890, 1717, 1640, 3703, 566, -117, -1339, -2341, 3245, -4614, -2349, -2235, 4601, 1840, 2209, -3503, 2283, 4250, 3058, 3421, -4825, -4419, 1787, -1729, -713, 2999, -2496, -21, -2862, -4300, -4470, -2539, -2882, -4795, 2540, 3828, -541, -3378, -602, -1240, 2098, -2065, -4519, -4386, 4567, 3493, 3596, 4161, 2746, -4462, 2670, -4462, -3524, -3445, -83, 1371, 1760, 752, -1242, 433, -2745, 4065, -4274, -2599, -1966, -2241, -4607, -4452, 2273, 3792, 1193, -2067, -4863, 2103, -1310, 3211, -1306, -332, -2373, 2498, -4011, 248, -1121, -3353, -3851, -4069, -4331, -4125, 598, 449, 436, -401, -4877, -3557, -3269, 3154, -2139, -566, 4385, -1033, -4184, -3607, 1704, 4866, -4047, -4692, 3223, 3684, -4208, -2333, -4952, -2531, -1070, -4189, 4814, 1090, 427, -1257, -3396, -4401, 1474, 2195, -4494, 158, 2589, 4858, 2809, 2889, -3553, -4960, -1182, 4364, 2975, -4974, 89, -2497, -4934, 1412, 1840, -2430, -324, 395, 3641, 4986, 2651, -3891, 3187, -4917, -3915, -1610, -3750, 3686, -245, -3619, 3128, 502, -723, -4138, 1424, -1435, -1128, -4168, -4115, -572, 1646, -4111, 1478, -4117, -75, -3735, -3740, 45, -4222, 821, -1145, -2480, -2073, -227, 134, 2251, -2325, -1664, 1334, -3999, -2263, 4310, 974, 2590, -4644, -3929, -2920, -4065, -2855, 2282, -3175, 3718, -1427, -288, -1963, -2, 4905, 2162, -3283, 3692, 4539, 3047, -4054, 4103, -4769, -885, -4161, 858, -4171, -2355, -1606, 2199, 4645, -728, -4325, -3138, -2928, -1227, -2520, -3762, 1897, -1458, 4608, 4203, -1723, 1125, -4866, -3599, 4078, 3382, -4831, -4264, 2478, 2939, -3862, 3721, -3574, -4337, -3323, -3425, 1724, 981, 2700, 2961, 3862, 1002, 3448, 95, -4316, -984, 137, 4507, -1007, -3716, -2056, -4741, -4179, 2058, -357, 2668, -4323, -4881, 4857, -1959, 3891, 264, -3377, 1915, 3072, 2929, -4159, -285, 2615, -2464, -43, 2759, -4300, -1548, 93, -759, -3171, -2552, 227, -3202, 1224, -4676, -2726, 3133, -2115, 38, -2830, 1862, -2371, 84, -3091, -122, 1923, 2085, 4400, -1976, -807, -1895, 4412, 765, 767, 407, -4323, -1216, -4296, -210, 4834, -4109, -4379, 3085, 2734, 190, -4458, 2998, -2914, -2982, 621, -4576, -2403, -3624, -746, 4669, 3108, -2073, -2507, 1068, 1366, 4102, -2562, -2400, -4181, -682, -2710, -16, 1339, -2444, 808, -368, -3522, 1814, -1213, 2239, 3074, 20, -4173, -2446, -3012, 2441, 1798, -1358, 4002, 1321, -4896, -1054, 2056, 3509, 4833, 2708, 4761, 1533, -4314, -196, 1385, -4858, 3842, 2260, -2839, -3380, -657, 4578, -3813, -4887, -1937, -409, 934, -4585, -4344, 4761, 12, 3411, -3041, 1251, 3738, -1630, 1124, 507, 3007, 2584, -4049, -1899, -511, -42, 441, -3210, 2013, -4588, -145, -3940, 2093, 3472, 402, -2324, -1457, 2373, 1266, 2651, 275, -3472, -4468, -4239, 469, -2497, -2271, 2107, 2892, -2549, 2953, 3392, -2430, -1481, 4472, -1593, -2506, 4505, 3440, -4617, -738, -3591, 3607, 3038, -640, 471, -3829, -4346, 4947, -3486, -477, -3771, -4511, 1766, 2887, 4756, 1632, 2470, 739, -4334, 3522, 2283, 3160, 2553, -295, 2091, -3741, 386, -3313, -371, -4958, 3317, -2955, -2644, -1612, 452, -1846, -4534, -3167, 2760, 1919, 631, 1738, -3733, 776, -3902, -686, 1320, -1947, -993, 1469, -784, 4722, 4842, 4007, 463, 1260, -4053, -1207, 3630, 3717, -1957, -3624, 314, 1626, 2117, -3666, -4380, -829, 1792, 3964, 4154, 3866, -307, -4336, -1225, -2000, -2788, -3900, 2551, 476, 1379, -4057, 2877, -1211, -4639, -3615, 3272, -3566, 144, 4561, 563, -496, -2054, -1112, -4692, -2843, -3570, 123, 1464, -926, -654, -1163, -3019, 318, 1611, 1292, 2591, -1168, 2123, 1461, 1991, -3539, 2330, 3498, 2369, 2291, 3400, -821, -883, -2683, 4914, -3405, -3559, 936, -3133, 2028, -3547, 2909, -1027, 2981, -3497, 1569, 1816, -3117, 367, 385, 3402, 230, 2157, 3681, 567, 3310, -3134, -1313, -1829, -1523, -3755, -2236, 1238, 2671, -2953, 1115, -408, 2311, -2343, -3595, -4947, 2171, -4420, -2260, -2470, -1325, -680, 790, -1623, -4002, 1586, -3396, -511, 4631, 4744, 3388, 1610, 3718, 1919, 3259, 927, -391, 3119, -3521, -2284, 1300, -3604, 1853, -3542, -4170, -407, -4194, 4849, -146, -728, 1160, -2706, -2946, 1333, -4854, -771, -4529, -4572, -4441, -2759, 4421, -2312, 1366, -2967, 1685, -2730, 329, -2739, -2140, -2792, 3982, -2838, -2494, 1878, -3021, -3103, 2887, 1538, -531, -4217, 2540, -2205, 2266, 3633, -1491, -443, -2683, 1134, -2947, 3135, -2742, -2407, 2843, -3307, 1466, -2049, 3140, -3906, -2063, 174, -2488, 1097, 4551, -2305, -3183, -1508, -3708, -4763, 2530, -4387, 296, -3290, -2611, 628, 809, 3786, -3256, 3840, 3182, 3569, 1120, 2393, 1292, -38, -786, -2473, 1807, -1806, 3705, -287, 2011, 3913, 1693, 4664, 1203, 3995, 2762, -619, 1946, 4909, -3952, -3232, 1624, -2489, 2954, -765, -3873, -367, 3240, -3138, 127, 2577, -1183, -2660, -4858, 100, 3400, 1558, -3524, -1846, -4065, 1430, 831, -3705, -1463, 623, 2922, -2073, 3029, -4789, 1211, -3246, 1880, -2747, -1707, -3679, -4215, 1528, -4557, -4000, -4445, -329, 4270, 2452, 4375, -369, -1360, 3934, 3040, 2986, 3834, -752, -3461, 3765, -2204, -4688, 2262, 52, -4269, -1013, -536, -2443, -752, 4556, -4830, 450, 2182, 2301, -1707, -901, -1668, 4044, -2669, -4925, -3996, 4050, 26, -934, -3262, 4801, 4623, -1157, -4559, -1620, 4695, 2918, -1341, -3637, -2372, 1329, -3912, 3854, 3613, -21, 3569, -4334, 2679, 2577, 2837, -1598, -1885, -1708, -3277, -2128, 4448, -4677, -3847, 948, -605, 197, -492, -2092, 2411, -1007, 2665, 1781, -1798, 2610, -172, 2256, 2705, 3965, 3023, -4231, -3285, -4747, -3195, -1316, 4478, -2855, -3160, -4167, 4285, 1900, -4032, -1006, 1633, -1115, -4652, 3281, 3032, 1256, 4910, -4128, 3982, -1099, -2694, -4365, 2860, -2529, 4527, 2137, 3343, 4768, 3233, -1005, 4171, 2603, 3942, 3011, 2879, -3966, -488, -407, -4470, -839, -1766, -4742, -3074, 906, 191, -557, 1188, -4773, -2281, 1484, 224, 4093, -4565, -1776, 3094, -1418, 3867, 3627, -2995, -3854, -2314, 1589, -4460, 3237, -2150, 3759, 4578, 3956, -2323, -2597, 3042, 1300, 811, 225, -3857, -3405, -3984, 1615, 3804, -3994, 3368, -3359, -4665, -4302, -3675, 3313, 3023, -2688, -382, 3457, 3396, 3339, -3914, -2906, 2846, 2043, -3478, -2089, 1280, -1545, 1358, 1847, 3870, -4010, -1127, -673, -1587, -1546, -3104, -2528, -550, 2241, -359, 646, -1475, 3213, 1824, 2929, 3695, 403, -2406, 2993, 1067, -2813, -360, 79, -4959, 3125, -2466, -140, -2000, -93, -2379, 2692, 293, 117, 2717, -4597, -1057, 2893, -4361, 4011, 1925, -972, 4978, -4252, -2150, -2108, 1444, -4346, -1377, -647, -2964, -3453, -3654, -4174, 1061, -1096, -4762, 2571, 1886, 1405, 299, -2944, -3272, -3733, -1249, -2981, 4991, 3166, 717, 846, 2093, -1813, -3579, -2088, 1867, 3299, -2556, 4897, -3799, -1672, -58, 2104, -3232, 4768, 1641, 1296, -3738, -4280, -3756, 2918, 4625, -3781, 2584, 3174, -4016, -4541, -1851, 2014, 695, -2497, 32, -1149, -3463, 1814, 3363, -349, -3781, -710, 917, -3317, -3082, 1584, 2252, -1414, -3731, 1248, -2863, -2603, -4576, -1832, -4973, 3148, -3007, -4618, 4271, 2669, -4107, -4123, -3986, 4104, -4516, -2057, -3505, 1811, -3707, 3892, 1798, -3010, -3701, -110, 3493, 4074, -3451, -1226, 4314, -4827, -931, 4218, 1865, 1833, 238, 4911, -1748, 1463, 1508, 149, -1912, -2755, 1231, -3080, -4894, 4271, -2632, 1421, 258, -843, 4647, -18, 3238, -878, 2723, -4094, 3706, -4811, -3844, -4655, -2649, 1923, 2118, -3450, -2903, -3164, -4409, -1594, -490, 813, -349, 880, 2844, -257, 2741, -3755, -422, -51, -3295, -486, 4785, 4227, 3624, 2204, 3356, -1083, 1227, -4445, -4898, -714, 4468, -3302, 3979, -3589, -2511, -4242, -1510, -4225, 3410, 2132, 2089, 2296, -3050, -1888, -4878, -2471, 2672, 836, 3277, 553, -1024, -4330, 4085, -2348, -3249, -4603, 4751, 4001, -4565, 1693, 72, 2916, 1716, 328, -3489, -2875, -3162, 2296, 3939, -3456, -3944, -2174, -2098, 1758, -412, -2979, -2414, -892, 4777, -2372, -3021, 1947, -2451, -3720, -1755, 128, -938, -4574, -281, -4323, 4091, -953, -1215, -1769, 2406, 3684, -3046, 1769, -291, 2956, -2579, 945, -1535, 1016, -3140, 1497, 3335, 190, 677, 3049, -3995, 2886, -1612, 3675, -1857, 2377, -4870, 3487, 1555, -2518, 253, 0, 2754, -4711, -2512, 215, -2992, -3690, -4060, 2799, -2003, 4707, 3454, -4696, 3237, -4515, -2501, -4208, 4613, -2388, 3682, -2017, 351, 1129, 2137, 33, 1600, -3136, -1317, -3143, 3968, -3290, -3032, -3292, -2359, 2732, -2563, -3316, -2501, -2299, 4869, 3583, 4256, 4692, 2640, -2913, 12, -1190, 820, -165, -3337, -4385, 897, 3677, -2226, -4866, 2553, 4533, 3878, -2714, 624, -2266, 3075, 349, -4288, 1984, -4376, 2792, 1504, 3822, -945, 3913, -4538, -527, -4916, -840, -3878, 1053, 4397, -3178, 4750, -3663, -1083, -994, -69, -2803, 2505, 4236, -4643, 1599, 3290, -3102, -4015, -3553, -3916, -4408, 3725, 3996, 4855, -172, 338, 2342, -572, 4795, -4258, -4963, 506, 1767, 53, 4793, 3505, -854, -1391, -1076, 4854, 4465, -2761, 1206, -791, 492, 1499, 3175, -3964, -1939, -1353, 618, 13, 1727, 712, 2896, -3091, 2841, -4870, 4090, 4034, 2915, 1286, -1477, -4334, -3656, -2264, -2963, 416, 893, -3051, -4029, -4156, -2223, 4285, 1200, -410, -4715, 3325, 2118, 668, -4994, 4729, -992, -459, -4775, 536, -3020, -4284, -4530, 384, 3747, -4672, 2936, 1204, -4300, 2523, 1364, -3589, 1040, -4750, -3496, -1517, -3234, 1141, -2330, -4155, -4494, 4088, -1744, 107, 3266, 857, -2322, -801, -2326, -845, 191, 3990, 4832, -4142, -4004, 3917, 3290, -1033, -3293, 3234, 3246, -3538, 4402, 3239, -1574, 4095, -4094, 3314, -4650, -414, 279, 2776, 822, 1879, -2699, 812, 676, -1836, 2357, -2430, 1038, -688, -4856, 1561, 3180, 3200, -4357, -3144, 3061, -2353, 939, 4808, 4290, 2452, -4021, -2382, -3581, -993, -2716, -453, 4977, 675, 3613, 3709, -1629, 3642, 1339, 1336, -2379, -3499, 1034, 3129, -3642, -3564, 3469, -2103, 3504, -202, -798, -1895, -3762, 32, -4935, -2484, -519, 579, 4023, -3273, -3229, -3687, -4618, 1140, -184, 3488, 319, 589, 513, 3259, -4149, -2729, -1717, -636, 2038, -1988, -1816, -3241, -1499, 4574, 3733, 59, 2714, 2649, 1595, 3522, -459, -4584, 377, -3948, -4435, 4891, -4862, -1690, -4033, 55, -1213, 2224, 3222, 1439, 2441, 1648, 1804, 2834, 4368, -3559, 3872, -2332, 4974, 4176, 137, -4367, -1759, 745, 3018, -3985, -2026, 4252, -4154, 3956, 524, 1966, 581, 3144, -2760, 4334, 296, -3124, 27, -3795, -2982, -709, -3359, -1535, 1191, -2529, 1259, -1300, -4783, -2984, -3057, -376, 2064, -3495, -3843, -3498, 2666, 4275, -2954, 2632, 4789, 1046, -2855, 1003, -1848, -3099, 3326, 4153, -3816, 4649, -4650, -4595, -654, -3975, 3970, -664, -205, 4793, -3677, 532, 3856, 896, -1790, 2776, 692, -450, 290, -1205, -1148, 2350, 3315, -4964, 4361, -1240, 4984, 3729, -2466, 1050, 3082, 1806, -3064, 584, -4210, -3383, 4182, 4066, -1884, 1388, 4425, -1899, 610, 1450, 4982, 3621, 193, 2038, 1754, -407, -105, -4720, 638, 167, 2420, -655, 1883, -1135, -304, -4167, -4610, -2368, -4811, 2839, -4817, -1183, -2871, 1753, -4321, 3613, -4400, 3252, 145, 4861, -2849, 3318, 3963, 2813, -93, 4554, -3524, -4383, -3789, 429, -2736, 966, 4531, 4942, -4302, 4522, -3845, 2587, 257, -1842, -536, -1238, 3510, -4054, -3935, 3380, -1835, 946, -1460, 2297, 3042, -536, -1806, -2416, -4730, -2285, -2800, -3794, -2894, -3698, -304, 3833, 2611, 4067, -4585, 1645, -4825, 1354, -1552, -81, -1921, 2988, 1321, 2592, -3403, -2803, -1491, 3652, -4929, -4342, -878, 1859, 2997, -4001, -3101, -880, -3680, -2964, 1984, -88, -3085, -1047, 4485, -4259, -4801, -3433, -792, 1844, -4831, 4681, -121, -3892, 2207, 259, 706, -1151, -925, 3026, -4876, 2607, 2774, -2116, -4872, -454, -1855, -4519, -3286, -4851, -832, -1662, -4693, 1793, -1496, -3895, -3303, 3217, 955, 1641, -2657, 1133, -2903, -4321, -4264, 4555, 633, -3046, -4070, -4748, 4904, -4721, -2512, -130, -3246, 1072, -2824, 1701, 415, 3086, -769, 2480, 4975, -4740, -4486, 3938, 1657, -10, 4438, 3981, 447, 242, -382, 1070, 631, -939, 2219, 3781, -4010, -2167, 3672, -3437, -3698, -4498, 1928, -4279, -102, -3553, -4055, 3406, -2778, 3686, 794, -1423, -2156, 3683, -3453, -1760, -4515, 1464, -3277, -4663, 1653, 2168, 3130, 255, -3534, -142, -2488, 4656, -1682, -1799, -4858, -3724, -3494, -2298, -4316, 23, -4730, 1312, 3250, -1525, -4689, 1850, 4195, 488, -3480, 1101, -4817, -202, 2892, 3848, 1784, -4755, -2813, -538, 3343, 3258, 1859, 3871, -984, 3172, -2168, -559, 2683, 1088, -2985, -1024, 3516, 3298, -4961, -3717, -1795, 4997, 4146, 769, -1325, -4083, 4387, 20, 1030, 2442, -3265, -2611, -4627, -1520, -2927, -4223, -4214, 3381, -3215, -4478, 3345, -4021, 1085, 713, -4065, 4735, -4117, -2814, 1096, -4352, -2915, -248, -4479, 4260, -3018, 1636, 2688, 4919, 2236, 1792, 2065, 4278, -802, -3504, 1386, -3989, -4024, 2547, -2879, -1798, 2245, 1702, 3564, -3461, -2428, -2743, -2630, -3080, -3346, 4359, -3920, 2298, -1609, -1040, -4490, 4591, 867, -2967, -3325, -2864, -4501, 2775, 790, -624, -3744, -4728, -4297, 86, -4033, 4515, -1458, -1505, -1434, 3456, -814, 3437, 4198, -2374, 3364, -3915, -3335, 3908, -4660, -3640, -2186, -3846, 3012, 4752, -1662, 3706, -2475, -4370, 4249, -1821, -1921, 3313, 3838, -2483, 3421, -855, 991, -3031, -3161, -692, 1565, -1238, 4473, -1319, -3030, -1853, 2053, -2292, 1508, 1715, -571, -3934, 2689, -337, -3229, 541, 1259, 3631, -1428, -2486, -4034, 988, 3170, 3168, -2801, -4345, -1150, -1556, -2064, 1278, 4406, 4427, -4687, 2523, -2629, -1673, 2073, -1539, -2827, 4934, -3898, 587, -3583, -3537, 1153, 1126, -4405, -3505, 4213, -2594, 2370, -1141, -1695, -2504, -167, -777, -148, 2879, -4481, 1126, 2793, -3415, -3535, -3629, 444, 2107, 2271, -913, 3099, 1519, 3596, 715, 2552, -2508, -247, 3257, 2590, -41, -1643, -4114, 2809, 865, 686, -2981, -4741, -2687, -2565, -3972, -899, -4532, -2131, -4544, 1731, 2578, 1074, -3605, -4157, -3726, -1684, 24, -4489, 3585, 722, 3971, -4943, -905, 3174, 38, -2817, 1658, 2295, 722, 1983, 1231, 4503, -2768, -700, 590, -3520, 2408, 505, -2298, -2142, 4818, -4443, 561, -880, 28, -1344, 713, -1668, -1908, 2182, 1467, -3680, 2358, -3926, -1013, 4094, -17, -3636, 2264, 4714, 1746, -610, -4575, 1255, -1837, -3533, 792, -769, -2381, -2120, -282, 1128, 4948, -280, 4079, -2909, -1234, 2587, 808, -2874, -175, -3841, 2518, -1780, -4965, -3686, 456, -853, 4156, -4866, -1640, -4249, 1208, -3522, -2706, -2411, 2524, 2976, 4694, -910, -4811, 4372, 2419, -4699, -3298, -156, -4477, 1539, -4391, -3173, 1637, 3186, 2416, -3173, 169, 2623, -101, -2486, -4585, -1356, 436, -1331, -4622, -3324, 2858, 2952, 4846, 2137, 915, -2012, -384, 2288, -2618, 3074, -4667, -1085, -3944, 656, -4938, 4616, -476, -2871, 2442, -3016, -128, 2049, -1604, 3026, 3582, -4798, 3775, 416, -4335, -448, 3759, -2245, -3583, -2156, -1446, 4443, 1824, -3001, 3422, -4879, 733, -3587, 4917, 793, -3127, -2940, -3825, 4074, 985, -2499, -3378, -1792, 2395, -3974, 1720, 1291, -3012, -4071, 4072, -4023, -4807, -4992, -2746, -4078, -4124, 137, -4184, -1197, -3910, 2912, -2711, 2253, 4979, 2299, -2678, -2098, 2602, 1369, -4346, -2271, 4734, -2562, -2726, 226, 1463, 3134, -2028, -652, 1453, 4503, -2693, 518, 3333, 2437, -4305, -1821, -4339, -1856, 2659, -4039, -3093, 1576, -1528, -4355, -1408, -2028, -4372, -804, 1811, 535, 835, -3771, -1284, -1468, -44, 1158, 4749, -380, -1704, 4724, -1880, -474, 1406, 3983, -1555, -4426, -3309, 1588, -4462, -4336, 3104, -4123, -4647, -2058, 2004, -4377, -148, 625, 2611, 2842, 3724, -3851, -4865, -1410, -4854, 2328, -1145, 2804, -3259, 1909, 4381, -2221, 4102, -4917, -4308, -4468, 2312, 1099, 1161, -3953, -2595, 290, 2569, 4959, -2372, -2861, -3772, 2580, -2529, -3222, 2440, 3456, -2852, 4444, -255, 1125, 2210, -302, 616, -3820, -185, 1064, 1226, 4472, 2479, 4593, -2518, -1995, 3536, 333, -3895, 2587, -4268, 638, -3835, -3936, -482, 3399, 32, 2508, -1104, -1562, -1022, -2362, 3245, -941, -831, -4256, 2362, -231, -3951, 1518, 1467, -4442, -2857, -1939, 603, 4190, -2814, -3774, -1397, 2004, -3700, -3232, -4577, -3653, 396, -434, 230, -3335, 1152, -3000, -1383, 4173, -4214, -4332, -3403, -3421, 1224, 2728, 1260, -2842, -1575, -1733, 4312, -4266, -4548, 169, 4562, -3430, 3211, 4235, 1890, -3289, -2936, -250, 3960, 2545, -233, -3246, -4213, 3217, -435, 4942, -2912, -4727, -2185, 2579, -4163, 4388, 4269, -3114, -1170, -4191, -360, 2321, 3319, 4881, -3374, -1980, -3589, -4546, 893, -3016, -2643, -2001, -4664, 3829, 950, -3543, -2595, -4635, -2666, -4951, 4094, 3592, -3730, -4881, -1983, 4313, 253, 1117, -23, 4160, -3495, -4847, -409, 1562, -1424, -146, -4928, -3866, -1984, 50, 4193, -3055, -3148, -4253, -2479, 3061, 1344, -4741, 3366, -2115, -561, -2282, 4107, 268, -1446, -2950, 2432, -1201, -2980, 1735, -3902, -2208, -1084, 1182, 4029, 316, -1941, -1242, -417, -2601, -3865, 3357, -4930, 271, -2658, 2780, -1123, -4594, 3295, 2686, -2597, 3252, 718, -1965, 2285, 3428, 1678, 960, -4899, -4051, -2636, 1385, 2626, 2157, -2263, -159, 3938, -3407, 2096, -3967, -507, 4768, 2873, 4935, 4109, -4904, -4619, -3439, 739, 584, 923, 3499, 1731, -3151, 442, 3606, 1850, 3287, 1040, -2231, 4223, -3412, 1467, -2917, -1600, -3842, 606, 1938, 4463, -4080, 3366, 758, 4685, 4023, -4771, 4298, 4356, 470, -1825, -804, -3317, 4988, 2619, -2054, -2810, 3275, -2531, 519, -659, 1197]
Output:
12996509
Expected:
12987535
*/