<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="assets/dist/css/font-awesome.min.css">
<!-- Theme style Admin LTE -->
<link rel="stylesheet" href="assets/dist/css/AdminLTE.min.css">
<link rel="stylesheet" href="assets/dist/css/skins/_all-skins.min.css">
<!-- iCheck -->
<link rel="stylesheet" href="assets/plugins/iCheck/flat/blue.css">
<!-- Morris chart -->
<link rel="stylesheet" href="assets/plugins/morris/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="assets/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet" href="assets/plugins/datepicker/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="assets/plugins/daterangepicker/daterangepicker.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<!-- Modal Delete -->
<div class="modal modal-danger" id="modal-delete">
	<div class="modal-dialog">
		  <div class="modal-content">
			  	<div class="modal-header">
			      	<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			        <span aria-hidden="true">&times;</span></button>
			      	<h4 class="modal-title">Delete Data</h4>
			    </div>
			    <div class="modal-body">
			      	Anda yakin akan menghapus data <label id="data-fakultas-delete"></label> ini ?
			    </div>
			    <div class="modal-footer">
			      	<button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
			      	<button type="button" id="btn-delete" data="" class="btn btn-outline">Delete</button>
			    </div>
		  </div>
		  <!-- /.modal-content -->
	</div>
<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
      
<!-- Modal Input -->
<div class="modal" id="modal-form">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">Primary Modal</h4>
			</div>
			<div class="modal-body">
				<form method="post" action="fakultas-controller.do"
					class="form-horizontal" id="form-fakultas">
					<input type="hidden" id="action" name="action" />
					
					<div class="form-group">
						<label class="col-md-3 control-label">ID</label>
						<div class="col-md-7">
							<input type="text" id="fakultasId" name="id"
								class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-3 control-label">Kode</label>
						<div class="col-md-7">
							<input type="text" id="fakultasCode" name="kode"
								class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-3 control-label">Fakultas</label>
						<div class="col-md-7">
							<input type="text" id="fakultasName" name="nama"
								class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-3 control-label">Description</label>
						<div class="col-md-7">
							<input type="text" id="fakultasDesc" name="keterangan"
								class="form-control" />
						</div>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-default pull-left"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save
							changes</button>
					</div>
				</form>
			</div>

		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<div class="row">
	<div class="col-md-12">
		<div class="box box-info">
			<div class="box-header">
				<h3 class="box-title">List Fakultas</h3>
				<div class="box-tools">
					<div class="input-group input-group-sm" style="width: 250px;">
						<input type="text" id="txt-search" name="txt-search"
							class="form-control pull-right" placeholder="Search">

						<div class="input-group-btn">
							<button id="btn-search" type="button" class="btn btn-default">
								<i class="fa fa-search"></i>
							</button>
							<button id="btn-add" type="button" class="btn btn-primary">
								<i class="fa fa-plus"></i>
							</button>
						</div>
					</div>
				</div>
			</div>
			<div class="box-body">

				<table class="table table-stripped table-bordered">
					<thead>
						<tr>
							<td>ID</td>
							<td>Kode Fakultas</td>
							<td>Nama Fakultas</td>
							<td>Keterangan</td>
							<td>Action</td>
						</tr>
					</thead>
					<tbody id="list-fakultas">
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<!-- jQuery 2.2.3 -->
<script src="assets/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
	$.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.6 -->
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="assets/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="assets/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="assets/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="assets/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="assets/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="assets/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="assets/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="assets/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="assets/dist/js/app.min.js"></script>
<script>
	function loadData() {
		$.ajax({
			url : 'fakultas.json',
			type : 'post',
			data : {
				action : 'load'
			},
			success : function(result) {
				var dataFakultas = "";
				// looping
				$.each(result.listFakultas, function(index, item) {
					dataFakultas += '<tr>' + 
							'<td>' + item.id + '</td>'+
							'<td>' + item.kode + '</td>' + 
							'<td>'+ item.nama + '</td>' + 
							'<td>'+ item.keterangan + '</td>' + 
							'<td>'+
								'<button type="button" class="btn btn-edit btn-success btn-xs" data="'+item.id+'"><i class="fa fa-edit"></i></button> '+
								'<button type="button" class="btn btn-delete btn-danger btn-xs" data="'+item.id+'"><i class="fa fa-trash-o"></i></button> '+
							'</td>' + 
						'</tr>';
				});

				// data yang dilooping kita tambahkan ke tbody
				$("#list-fakultas").html(dataFakultas);
			}
		});
	}

	$(document).ready(function() {
		loadData();
		
		// btn-add click
		$("#btn-add").click(function() {
			$("#form-fakultas").trigger("reset");
			$("#modal-form").modal('show');
			$("#action").val("insert");
		});
		
		// btn-edit click
		$("#list-fakultas").on("click",".btn-edit",function(e){
			e.preventDefault();
			var vId = $(this).attr('data');
			$.ajax({
				url : 'fakultasEdit.json',
				type : 'post',
				data : { id:vId },
				success : function(result) {
					$("#action").val("update");
					$("#fakultasId").val(result.fakultas.id);
					$("#fakultasCode").val(result.fakultas.kode);
					$("#fakultasName").val(result.fakultas.nama);
					$("#fakultasDesc").val(result.fakultas.keterangan);
					$("#modal-form").modal('show');
				}
			});
		});
		
		// show form Delete
		$("#list-fakultas").on("click",".btn-delete",function(e){
			e.preventDefault();
			var vId = $(this).attr('data');
			$.ajax({
				url : 'fakultasEdit.json',
				type : 'post',
				data : { id:vId },
				success : function(result) {
					$("#action").val("update");
					$("#data-fakultas-delete").val(result.fakultas.nama);
					$("#btn-delete").attr("data",result.fakultas.id);
					$("#modal-delete").modal('show');
				}
			});
		});
		
		// Delete Action
		$("#btn-delete").click(function(e){
			e.preventDefault();
			var vId = $(this).attr('data');
			$.ajax({
				url : 'fakultasDelete.json',
				type : 'post',
				data : { id:vId },
				success : function(result) {
					if(result.success){
						loadData();
					}
				}
			});
		});
		
		//form fakultas submit
		$("#form-fakultas").submit(function(){
			var vdata = $(this).serialize();
			$.ajax({
				url : 'fakultasSave.json',
				type : 'post',
				data : vdata,
				success : function(result) {
					if(result.success){
						$("#modal-form").modal('hide');
						loadData();
					}
				}
			});
			return false;
		});

		// btn-search click
		$("#btn-search").click(function() {
				var vSearch = $("#txt-search").val();
				$.ajax({
					url : 'fakultasSearch.json',
					type : 'post',
					data : {
						keySearch : vSearch
					},
					success : function(result) {
						var dataFakultas = "";
						// looping
						$.each(result.listFakultas, function(index, item) {
							dataFakultas += '<tr>' + 
							'<td>' + item.id + '</td>'+
							'<td>' + item.kode + '</td>' + 
							'<td>'+ item.nama + '</td>' + 
							'<td>'+ item.keterangan + '</td>' + 
							'<td>'+
								'<button type="button" class="btn btn-edit btn-success btn-xs" data="'+item.id+'"><i class="fa fa-edit"></i></button> '+
								'<button type="button" class="btn btn-delete btn-danger btn-xs" data="'+item.id+'"><i class="fa fa-trash-o"></i></button> '+
							'</td>' + 
						'</tr>';
						});

						// data yang dilooping kita tambahkan ke tbody
						$("#list-fakultas").html(dataFakultas);
					}
				});
			});
		});
</script>