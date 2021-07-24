<template>
	<div class="header">
		<div class="logo"></div>
		<div class="title">
			<h2 class="font">
				<span>News</span> <span>gathering</span> <span>place</span>
			</h2>
		</div>
		<div class="demo-type">
			<!-- <div>
				<el-avatar icon="el-icon-user-solid"></el-avatar>
			</div> -->
			<div>
				<el-avatar
					ref="userface"
					class="userface"
					src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"
				></el-avatar>
			</div>
			<!-- <div>
				<el-avatar> user </el-avatar>
			</div> -->
		</div>
	</div>
</template>

<script>
export default {
	name: "Header",
};
</script>

<style scoped>
.header {
	display: flex;
	justify-items: center;
	align-items: center;
	text-align: center;
}
.header .logo {
	flex: 1;
}
.header .title {
	flex: 4;
	/* text-align: center; */
	font-family: "Poppins", sans-serif;

	/* box-sizing: border-box; */
	/* display: flex; */
}
.header .title .font {
	font-size: 2em;
	font-weight: 500;
	color: #222;
	letter-spacing: 0.3125rem;
	cursor: pointer;
}
.header .title .font span {
	transition: all 0.5s;
}
.header .title .font:hover span:nth-of-type(1) {
	margin-right: 10px;
}
.header .title .font:hover span:nth-of-type(2) {
	margin-left: 10px;
}
.header .title .font:hover span:nth-of-type(3) {
	margin-left: 10px;
}
.header .title .font:hover span {
	color: #eee;
	text-shadow: 0 0 0.625rem #000, 0 0 20px #000, 0 0 40px #000, 0 0 80px #000,
		0 0 120px #000, 0 0 160px #000;
}
.header .demo-type {
	flex: 1;
}
.header .demo-type .userface {
	cursor: pointer;
}
</style>