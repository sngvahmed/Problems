var config = {
	entry: './solution.js',
	output: {
		path: __dirname + '/build',
		filename: 'index.js',
	},
	devServer: {
		inline: true,
		port: 8080
	},
	module: {
		rules: [
			{
				test: /\.jsx?$/,
				exclude: /node_modules/,
				use: {
					loader: 'babel-loader',
				},
			}
		]
	}
};

module.exports = config;
