 var $table = $('#book_table');
     $button = $('#button');
     $(function () {
		$table.bootstrapTable({		
			
            striped: true,  //表格显示条纹  
            pagination: true, //启动分页  
            pageSize: 1,  //每页显示的记录数  
            pageNumber:1, //当前第几页  
            pageList: [5, 10, 15, 20, 25],  //记录数可选列表  
            search: false,  //是否启用查询  
            showColumns: true,  //显示下拉框勾选要显示的列  
            showRefresh: true,  //显示刷新按钮  
            sidePagination: "server", //表示服务端请求  
            //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
            //设置为limit可以获取limit, offset, search, sort, order  
            queryParamsType : "undefined",   
			columns: [{
				field: 'id',
				title: 'Item ID',				
			}, {
				field: 'name',
				title: 'Item Name'
			}, {
				field: 'price',
				title: 'Item Price'
			}],
			data: [{
				id: 1,
				name: 'Item 1',
				price: '$1'
			}, {
				id: 2,
				name: 'Item 2',
				price: '$2'
			}, {
				id: 2,
				name: 'Item 2',
				price: '$2'
			}, {
				id: 2,
				name: 'Item 2',
				price: '$2'
			}, {
				id: 2,
				name: 'Item 2',
				price: '$2'
			}]  
			});
    });

 