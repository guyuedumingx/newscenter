<template>
	<div class="list-part">
		<h2 class="list-name" @click="getNewsLists">新闻夹</h2>

		<el-collapse
			class="news"
			v-for="(item, index) in news"
			:key="item.id"
			v-model="activeName"
			accordion
		>
			<el-collapse-item
				class="title"
				:title="countTitle(item.title)"
				:name="index + 1"
				ref="title"
			>
				<div class="content">
					<p class="newstitle" :title="item.title">标题: {{ item.title }}</p>
					<p class="detail">详情: {{ item.text }}</p>
					<p class="time" :title="item.time">添加时间: {{ item.time }}</p>

					<a class="showNews" @click="showNews()">⇢渲染新闻</a>
					<a class="toNews" :href="item.url">⇢新闻原页面</a>
				</div>
			</el-collapse-item>
		</el-collapse>
	</div>
</template>

<script>
import "../common/jquery.min.js";
import axios from "axios";
import News from "./News.vue";
import { getJosn } from "../api/getNewsList";
export default {
	name: "Newslist",
	components: {
		News,
	},
	props: ["isShowNews"],
	data() {
		return {
			activeName: "1",
			isshownews: false,
			news: [
				{
					id: 1,
					time: "2021.07.22",
					url: "http://news.hsw.cn/system/2021/0719/1345729.shtml",
					title: "吴亦凡回应私生活风波：“没灌酒、没诱奸、没未成年”",
					text: "吴亦凡回应都美竹爆料，他表示:“之前没有回应是因为不想干扰司法程序的推进，但没想到我的沉默却纵容了造谣者的变本加厉”。随后，工作室也发文回应称：“拒绝一切诽谤言论及散布有害网络信息的行为，请勿利用敏感的舆论风向恶意煽动公众情绪!我方已启动法律追责程序并完成报案工作，相信法律的公正，必会还原事实真相!”，并晒出多张都美竹的发文爆料，配上“假”的logo。",
				},
				{
					id: 2,
					time: "2021.07.22",
					title: "iphone被曝安全隐患",
					text: "新闻具体描述新闻具体描述新闻具体描述新闻具体描述",
				},
			],
		};
	},
	computed: {},
	methods: {
		getNewsLists() {
			axios({
				url: "http://123.207.32.32:8000/home/multidata",
			}).then((res) => {
				console.log(res);
			});
			// getJosn().then((res) => {
			// 	console.log(res);
			// });
			// axios.get("/src/api/accordion.json").then((res) => {
			// 	console.log(res);
			// });
		},
		countTitle(text) {
			if (text.length >= 15) {
				return text.substr(0, 16) + "...";
			}
			return text;
		},
		showNews() {
			const val = !this.isShowNews;
			// console.log(val);
			this.$emit("showNews", val);

			// this.isshownews = true;
			// console.log(this.isshownews);
		},
	},
};
</script>


<style scoped>
.list-name {
	width: 100%;
	text-align: center;
	line-height: 2.5em;
}

.title {
	padding: 0 10px;
	/* background-color: #fffef8; */
}
.el-collapse,
.el-collapse-item__wrap {
	border-color: #66a9c9;
}
.el-collapse-item:last-child {
	margin-bottom: 0;
}
.news {
	position: relative;
}

.news a {
	display: block;
	cursor: pointer;
	/* float: right; */
	font-size: 12px;
	color: #777;
	text-align: right;
}
.news a:hover {
	color: #111;
}
.news p {
	font-size: 12px;
	color: #777;
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
}
.news p.newstitle {
	font-size: 13px;
	color: #444;
}
</style>