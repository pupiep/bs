<html>
	<head>
		<meta charset="utf-8">
		<title>书籍列表</title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>编号</th>
								<th>书籍名称</th>
								<th>预览图</th>
								<th>价格</th>
								<th>出版社</th>
								<th>ISBN</th>
								<th>库存</th>
								<th>状态</th>
								<th>类目</th>
								<th>上架时间</th>
								<th>描述</th>
							</tr>
						</thead>
						<tbody>
						<#list bookPage.content as book>
							<tr>
								<td>${book.bookId}</td>
								<td>${book.bookName}</td>
								<td><img height="100" width="100" src="${book.bookIcon}" alt=""></td>
								<td>${book.bookPrice}</td>
								<td>${book.bookPress}</td>
								<td>${book.bookIsbn}</td>
								<td>${book.bookStock}</td>
								<td>${book.getBookStatusEnum().msg}</td>
								<td>${book.category.categoryName}</td>
								<td>${book.createTime}</td>
								<td>${book.bookDescription}</td>
							</tr>
						</#list>
						</tbody>
					</table>
					<ul class="pagination pull-right">
						<#if currentpage lte 1>
							<li class="disabled"><a href="#">上一页</a></li>
						<#else>
							<li><a href="#">上一页</a></li>
						</#if>
						<#list 1..bookPage.getTotalPages() as index>
						<#if currentpage == index>
						<li class="disabled"><a href="#">${index}</a></li>
						<#else>
						<li><a href="/backstage/book/list?page=${index}&size=${size}">${index}</a></li>
						</#if>
						</#list>
						<#if currentpage gte bookPage.getTotalPages()>
							<li class="disabled"><a href="#">下一页</a></li>
						<#else>
							<li><a href="/backstage/book/list?page=${currentpage + 1}&size=${size}">下一页</a></li>
						</#if>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>